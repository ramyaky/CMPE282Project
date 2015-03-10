
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css")),format.raw/*14.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.at("images/favicon.png")),format.raw/*15.97*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*16.84*/("""">
        <!--external css-->
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("font-awesome/css/font-awesome.css")),format.raw/*18.92*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.55*/routes/*19.61*/.Assets.at("stylesheets/zabuto_calendar.css")),format.raw/*19.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.at("javascripts/gritter/css/jquery.gritter.css")),format.raw/*20.117*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*21.55*/routes/*21.61*/.Assets.at("lineicons/style.css")),format.raw/*21.94*/("""">    
    
        <!-- Custom styles for this template -->
        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.at("stylesheets/style.css")),format.raw/*24.80*/("""">
        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.Assets.at("stylesheets/style-responsive.css")),format.raw/*25.91*/("""">
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.at("stylesheets/morris-0.4.3.min.css")),format.raw/*26.91*/("""">
        
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.at("javascripts/weather.js")),format.raw/*28.65*/(""""></script>        
        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*29.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.at("javascripts/chart-master/Chart.js")),format.raw/*30.76*/(""""></script>
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body onload="getCurrentWeather();">
        """),_display_(/*38.10*/content),format.raw/*38.17*/("""
    """),format.raw/*39.5*/("""</body>

        <!--<script src=""""),_display_(/*41.27*/routes/*41.33*/.Assets.at("javascripts/jquery.js")),format.raw/*41.68*/(""""></script>
        <script src=""""),_display_(/*42.23*/routes/*42.29*/.Assets.at("javascripts/jquery-1.8.3.min.js")),format.raw/*42.74*/(""""></script> -->
        <script src=""""),_display_(/*43.23*/routes/*43.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*43.71*/(""""></script>
        <script class="include" type="text/javascript" src=""""),_display_(/*44.62*/routes/*44.68*/.Assets.at("javascripts/jquery.dcjqaccordion.2.7.js")),format.raw/*44.121*/(""""></script>
        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.at("javascripts/jquery.scrollTo.min.js")),format.raw/*45.77*/(""""></script>
        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.at("javascripts/jquery.nicescroll.js")),format.raw/*46.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.at("javascripts/jquery.sparkline.js")),format.raw/*47.74*/(""""></script>


        <!--common script for all pages-->
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.at("javascripts/common-scripts.js")),format.raw/*51.72*/(""""></script>
    
        <script type="text/javascript" src=""""),_display_(/*53.46*/routes/*53.52*/.Assets.at("javascripts/gritter/js/jquery.gritter.js")),format.raw/*53.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*54.46*/routes/*54.52*/.Assets.at("javascripts/gritter-conf.js")),format.raw/*54.93*/(""""></script>

        <!--script for this page-->
        <script src=""""),_display_(/*57.23*/routes/*57.29*/.Assets.at("javascripts/sparkline-chart.js")),format.raw/*57.73*/(""""></script>    
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.at("javascripts/zabuto_calendar.js")),format.raw/*58.73*/(""""></script>
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.at("javascripts/jquery-ui-1.9.2.custom.min.js")),format.raw/*59.84*/(""""></script>
        <script src=""""),_display_(/*60.23*/routes/*60.29*/.Assets.at("javascripts/jquery.ui.touch-punch.min.js")),format.raw/*60.83*/(""""></script>
        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.at("javascripts/raphael-min.js")),format.raw/*61.69*/(""""></script>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.at("javascripts/morris-0.4.3.min.js")),format.raw/*62.74*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*63.46*/routes/*63.52*/.Assets.at("javascripts/jquery.canvasjs.min.js")),format.raw/*63.100*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*64.46*/routes/*64.52*/.Application.javascriptRoutes()),format.raw/*64.83*/(""""></script>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 09 19:10:08 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/main.scala.html
                  HASH: d4605f2400e94d77d91f0ea9d2e7495cfdcf7e67
                  MATRIX: 727->1|845->31|873->33|1268->401|1294->406|1383->468|1398->474|1453->508|1541->569|1556->575|1609->607|1677->648|1692->654|1752->693|1848->762|1863->768|1931->815|2015->872|2030->878|2097->923|2181->980|2196->986|2274->1042|2358->1099|2373->1105|2427->1138|2553->1237|2568->1243|2624->1278|2692->1319|2707->1325|2774->1371|2842->1412|2857->1418|2924->1464|2985->1498|3000->1504|3057->1540|3126->1582|3141->1588|3207->1633|3291->1690|3306->1696|3374->1743|3802->2144|3830->2151|3862->2156|3924->2191|3939->2197|3995->2232|4056->2266|4071->2272|4137->2317|4202->2355|4217->2361|4280->2403|4380->2476|4395->2482|4470->2535|4531->2569|4546->2575|4615->2623|4676->2657|4691->2663|4758->2709|4842->2766|4857->2772|4923->2817|5029->2896|5044->2902|5108->2945|5197->3007|5212->3013|5288->3067|5372->3124|5387->3130|5449->3171|5547->3242|5562->3248|5627->3292|5692->3330|5707->3336|5772->3380|5833->3414|5848->3420|5924->3475|5985->3509|6000->3515|6075->3569|6136->3603|6151->3609|6212->3649|6273->3683|6288->3689|6354->3734|6438->3791|6453->3797|6523->3845|6607->3902|6622->3908|6674->3939
                  LINES: 26->1|29->1|31->3|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|79->51|79->51|79->51|81->53|81->53|81->53|82->54|82->54|82->54|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64
                  -- GENERATED --
              */
          