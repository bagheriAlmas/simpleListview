package ir.almasapps.simplelistview.Data

import ir.almasapps.simplelistview.R
import ir.almasapps.simplelistview.model.App

object DataService {
    var data = listOf(
        App("Facebook","Social Network","Mark Zuckerberg","Meta",R.drawable.facebook,"#FF35518D"),
        App("Twitter","Social Network","Parag Agrawal","Twitter, Inc",R.drawable.twitter,"#FF1E9CEA"),
        App("Pinterest","Image Sharing","Ben Silbermann","Pinterest, Inc",R.drawable.pinterest,"#FF9D1112"),
        App("LinkedIn","Online Service Provider","Satya Nadella","Microsoft",R.drawable.linkedin,"#FF5A86A4"),
        App("Whatsapp","Messenger Application","Mark Zuckerberg","Meta",R.drawable.whatsapp,"#FF10887A"),
        App("Skype","Video Confrance","Niklas Zennström","Microsoft",R.drawable.skype,"#FF13A0EC"),
        App("Instagram","Social Network","Adam Mosseri ","Meta",R.drawable.instagram,"#FFB16B73"),
        App("Youtube","Video Sharing","Susan Wojcicki","Meta",R.drawable.youtube,"#FFDF2E25")
    )
}