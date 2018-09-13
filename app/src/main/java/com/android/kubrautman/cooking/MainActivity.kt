package com.android.kubrautman.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.kubrautman.cooking.adapter.CookAdapter
import com.android.kubrautman.cooking.dto.CookDTO
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_recipe.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cookList=ArrayList<CookDTO>()

        cookList.add(CookDTO("Çorba","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/11/mushroom-potato-soup-440-400.jpg?itok=VnlilJ7y"))
        cookList.add(CookDTO("W","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/12/celery-soup.jpg?itok=OgQjpW-Y"))
        cookList.add(CookDTO("E","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/11/ramen.jpg?itok=whgIie33"))
        cookList.add(CookDTO("F","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/10/celeriac-soup.jpg?itok=DE36b877"))
        cookList.add(CookDTO("G","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/11/winter-soup.jpg?itok=qun8qBP3"))
        cookList.add(CookDTO("H","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/08/creamy-chicken-sweetcorn-soup.jpg?itok=kBen4ATp"))
        cookList.add(CookDTO("J","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/06/bouillebaisse.jpg?itok=0U642Gui"))
        cookList.add(CookDTO("K","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/05/cucumber-pea-lettuce-soup.jpg?itok=mMrucw8M"))
        cookList.add(CookDTO("L","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/07/gazpacho-with-runner-bean-tempura-pickled-coriander-seeds.jpg?itok=RZAf9w7P"))
        cookList.add(CookDTO("Ş","https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/06/clam_chowder.jpg?itok=XIRbR8Q5"))








  recyclerView.apply {

      this.layoutManager=LinearLayoutManager(this@MainActivity)
      this.adapter = CookAdapter(cookList ) { view, cookDTO ->

          Toast.makeText(this@MainActivity, "Tıkladınız", Toast.LENGTH_SHORT).show()


      }

  }
    }
}
