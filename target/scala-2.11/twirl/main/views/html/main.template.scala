
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
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.at("javascripts/raphael-min.js")),format.raw/*31.69*/(""""></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.at("javascripts/morris.min.js")),format.raw/*32.68*/(""""></script>
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body onload="getCurrentWeather();">
        """),_display_(/*40.10*/content),format.raw/*40.17*/("""
    """),format.raw/*41.5*/("""</body>

        <!--<script src=""""),_display_(/*43.27*/routes/*43.33*/.Assets.at("javascripts/jquery.js")),format.raw/*43.68*/(""""></script>
        <script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.at("javascripts/jquery-1.8.3.min.js")),format.raw/*44.74*/(""""></script> -->
        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*45.71*/(""""></script>
        <script class="include" type="text/javascript" src=""""),_display_(/*46.62*/routes/*46.68*/.Assets.at("javascripts/jquery.dcjqaccordion.2.7.js")),format.raw/*46.121*/(""""></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.at("javascripts/jquery.scrollTo.min.js")),format.raw/*47.77*/(""""></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.at("javascripts/jquery.nicescroll.js")),format.raw/*48.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.at("javascripts/jquery.sparkline.js")),format.raw/*49.74*/(""""></script>


        <!--common script for all pages-->
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.at("javascripts/common-scripts.js")),format.raw/*53.72*/(""""></script>
    
        <script type="text/javascript" src=""""),_display_(/*55.46*/routes/*55.52*/.Assets.at("javascripts/gritter/js/jquery.gritter.js")),format.raw/*55.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*56.46*/routes/*56.52*/.Assets.at("javascripts/gritter-conf.js")),format.raw/*56.93*/(""""></script>

        <!--script for this page-->
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.at("javascripts/sparkline-chart.js")),format.raw/*59.73*/(""""></script>    
        <script src=""""),_display_(/*60.23*/routes/*60.29*/.Assets.at("javascripts/zabuto_calendar.js")),format.raw/*60.73*/(""""></script>
        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.at("javascripts/jquery-ui-1.9.2.custom.min.js")),format.raw/*61.84*/(""""></script>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.at("javascripts/jquery.ui.touch-punch.min.js")),format.raw/*62.83*/(""""></script>
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
                  DATE: Tue Mar 10 22:50:16 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/main.scala.html
                  HASH: 808f710cad095de919690c7cbed7d137c914bc6d
                  MATRIX: 727->1|845->31|873->33|1268->401|1294->406|1383->468|1398->474|1453->508|1541->569|1556->575|1609->607|1677->648|1692->654|1752->693|1848->762|1863->768|1931->815|2015->872|2030->878|2097->923|2181->980|2196->986|2274->1042|2358->1099|2373->1105|2427->1138|2553->1237|2568->1243|2624->1278|2692->1319|2707->1325|2774->1371|2842->1412|2857->1418|2924->1464|2985->1498|3000->1504|3057->1540|3126->1582|3141->1588|3207->1633|3291->1690|3306->1696|3374->1743|3435->1777|3450->1783|3511->1823|3572->1857|3587->1863|3647->1902|4075->2303|4103->2310|4135->2315|4197->2350|4212->2356|4268->2391|4329->2425|4344->2431|4410->2476|4475->2514|4490->2520|4553->2562|4653->2635|4668->2641|4743->2694|4804->2728|4819->2734|4888->2782|4949->2816|4964->2822|5031->2868|5115->2925|5130->2931|5196->2976|5302->3055|5317->3061|5381->3104|5470->3166|5485->3172|5561->3226|5645->3283|5660->3289|5722->3330|5820->3401|5835->3407|5900->3451|5965->3489|5980->3495|6045->3539|6106->3573|6121->3579|6197->3634|6258->3668|6273->3674|6348->3728|6432->3785|6447->3791|6517->3839|6601->3896|6616->3902|6668->3933
                  LINES: 26->1|29->1|31->3|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|68->40|68->40|69->41|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|81->53|81->53|81->53|83->55|83->55|83->55|84->56|84->56|84->56|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64
                  -- GENERATED --
              */
          