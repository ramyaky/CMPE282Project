
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
object simulate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Double],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myArray: List[Double]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.google.gson.Gson

Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to My Play")/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""

  """),format.raw/*7.3*/("""<section id="container" >

"""),_display_(/*9.2*/commonTemplate()),format.raw/*9.18*/("""
      
      """),format.raw/*11.7*/("""<section id="main-content">
          <section class="wrapper site-min-height">
          	<h3><i class="fa fa-angle-right"></i> Simulation </h3>
          	<div class="row mt">
          		<div class="col-lg-10">
                    <label> Click the button to simulate cattle temperature </label>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button id="simulate-button" type="button"> Simulate </button>
                    <br><br>
                    <div id="simulate-data" align="center"> </div>
          		</div>
          	</div>
	      </section>
      </section>

"""),_display_(/*26.2*/footer()),format.raw/*26.10*/("""

  """),format.raw/*28.3*/("""</section>
  
  <script type="text/javascript">
    $('#simulate-button').click(function () """),format.raw/*31.45*/("""{"""),format.raw/*31.46*/("""
        """),format.raw/*32.9*/("""//Better to construct options first and then pass it as a parameter
        """),format.raw/*33.60*/("""
        """),format.raw/*34.9*/("""var data = """),_display_(/*34.21*/myArray),format.raw/*34.28*/(""";
        var dataValues = [];
        for(var i=0; i< data.length;i=i+2)"""),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""
            """),format.raw/*37.13*/("""dataValues.push("""),format.raw/*37.29*/("""{"""),format.raw/*37.30*/("""
                """),format.raw/*38.17*/("""x: data[i],
                y: data[i+1]
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""");
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""
        """),format.raw/*42.9*/("""var options = """),format.raw/*42.23*/("""{"""),format.raw/*42.24*/("""
            """),format.raw/*43.13*/("""backgroundColor: "#f2f2f2",
            title: """),format.raw/*44.20*/("""{"""),format.raw/*44.21*/("""
                """),format.raw/*45.17*/("""text: "Cattle sensor values simulation"
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/(""",
            animationEnabled: true,
            data: [
             """),format.raw/*49.14*/("""{"""),format.raw/*49.15*/("""
                """),format.raw/*50.17*/("""type: "spline", //change it to line, area, column, pie, etc
                dataPoints: dataValues
             """),format.raw/*52.14*/("""}"""),format.raw/*52.15*/("""
            """),format.raw/*53.13*/("""],
            axisX: """),format.raw/*54.20*/("""{"""),format.raw/*54.21*/("""
                """),format.raw/*55.17*/("""interval: 1
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""";

        $("#simulate-data").CanvasJSChart(options);

    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/(""");
  </script>

""")))}),format.raw/*64.2*/("""
"""))}
  }

  def render(myArray:List[Double]): play.twirl.api.HtmlFormat.Appendable = apply(myArray)

  def f:((List[Double]) => play.twirl.api.HtmlFormat.Appendable) = (myArray) => apply(myArray)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 15:38:00 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/simulate.scala.html
                  HASH: dd91ed9e0870098d91a6e6160b9fed4bd37e764e
                  MATRIX: 732->1|870->24|900->58|928->61|962->87|1001->89|1033->95|1088->125|1124->141|1167->157|1811->775|1840->783|1873->789|1996->884|2025->885|2062->895|2167->1023|2204->1033|2243->1045|2271->1052|2374->1127|2403->1128|2445->1142|2489->1158|2518->1159|2564->1177|2647->1232|2676->1233|2715->1245|2744->1246|2781->1256|2823->1270|2852->1271|2894->1285|2970->1333|2999->1334|3045->1352|3126->1405|3155->1406|3257->1480|3286->1481|3332->1499|3474->1613|3503->1614|3545->1628|3596->1651|3625->1652|3671->1670|3724->1695|3753->1696|3790->1706|3819->1707|3910->1771|3938->1772|3988->1792
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|36->9|36->9|38->11|53->26|53->26|55->28|58->31|58->31|59->32|60->33|61->34|61->34|61->34|63->36|63->36|64->37|64->37|64->37|65->38|67->40|67->40|68->41|68->41|69->42|69->42|69->42|70->43|71->44|71->44|72->45|73->46|73->46|76->49|76->49|77->50|79->52|79->52|80->53|81->54|81->54|82->55|83->56|83->56|84->57|84->57|88->61|88->61|91->64
                  -- GENERATED --
              */
          