package com.sist.lastapplication

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_news.*
import org.json.JSONObject
import java.net.URL
// 웹-앱
class NewsActivity : AppCompatActivity() {
    var dataList = ArrayList<HashMap<String, String>>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        fetchJsonData().execute("맛집")

        news_btn.setOnClickListener{
            val fd=news_editView.text
            dataList.clear()
            fetchJsonData().execute(fd.toString())
        }
        news_ListView.onItemClickListener = AdapterView.OnItemClickListener {
                parent, view, position, id ->

            var link=dataList.get(position).get("link")

            val intent=Intent(this,NewsDetailActivity::class.java)
            intent.putExtra("link",link.toString())
            // 화면 이동
            startActivity(intent)
            //Toast.makeText(this,"선택번호:$cateno",Toast.LENGTH_SHORT).show()
        }
    }

    // 데이터 읽기
    inner class fetchJsonData() : AsyncTask<String, Void, String>() {
        override fun onPreExecute() {
            super.onPreExecute()

        }
        // execute("","","")
        override fun doInBackground(vararg params: String?): String? {
            return URL("http://211.238.142.181:3355/news2?fd="+params[0]).readText(
                Charsets.UTF_8
            )
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            val jsonObj = JSONObject(result)
            // {"category":[{},{},{}]}
            val usersArr = jsonObj.getJSONArray("news")
            for (i in 0 until usersArr.length()) {
                val singleUser = usersArr.getJSONObject(i)

                val map = HashMap<String, String>()
                map["title"] = singleUser.getString("title")
                map["content"] = singleUser.getString("description")
                map["author"]=singleUser.getString("author")
                map["link"]=singleUser.getString("link")
                dataList.add(map)
            }
            val newsListView=findViewById<ListView>(R.id.news_ListView)
            newsListView.adapter = NewsAdapter(this@NewsActivity, dataList)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId)
        {
            R.id.home_menu->{
                // 화면 이동
                var intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_pop->{
                var intent= Intent(this,PopActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_recommand->{
                var intent= Intent(this,RecommandActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_recipe->{
                var intent= Intent(this,RecipeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_news->{
                var intent= Intent(this,NewsActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}