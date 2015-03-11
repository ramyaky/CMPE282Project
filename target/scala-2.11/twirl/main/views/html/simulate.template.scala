
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
"""),_display_(/*5.2*/main("Cattle Center Dashboard")/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""

  """),format.raw/*7.3*/("""<section id="container" >

"""),_display_(/*9.2*/commonTemplate()),format.raw/*9.18*/("""
      
      """),format.raw/*11.7*/("""<section id="main-content">
          <section class="wrapper site-min-height">
          	<h3><i class="fa fa-angle-right"></i> Simulation </h3>
          	<div class="row mt">
          		<div class="col-lg-10">
                    <label> Click the button to simulate cattle temperature </label>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button id="simulate-button" type="button"> Simulate Sick Scenario </button>
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
                """),format.raw/*55.17*/("""interval: 1,
                suffix: ":00",
                title: "Sensor reading intervals"
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/(""",
            axisY: """),format.raw/*59.20*/("""{"""),format.raw/*59.21*/("""
                """),format.raw/*60.17*/("""title: "Cattle body Temp (F)"
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""";

        $("#simulate-data").CanvasJSChart(options);

    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""");
  </script>

""")))}),format.raw/*69.2*/("""
"""))}
  }

  def render(myArray:List[Double]): play.twirl.api.HtmlFormat.Appendable = apply(myArray)

  def f:((List[Double]) => play.twirl.api.HtmlFormat.Appendable) = (myArray) => apply(myArray)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 01:20:13 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/simulate.scala.html
                  HASH: 9ae64b59c3ed4bbe5c1670c3c10f5b5bc02943ba
                  MATRIX: 732->1|870->24|900->58|928->61|967->92|1006->94|1038->100|1093->130|1129->146|1172->162|1830->794|1859->802|1892->808|2015->903|2044->904|2081->914|2186->1042|2223->1052|2262->1064|2290->1071|2393->1146|2422->1147|2464->1161|2508->1177|2537->1178|2583->1196|2666->1251|2695->1252|2734->1264|2763->1265|2800->1275|2842->1289|2871->1290|2913->1304|2989->1352|3018->1353|3064->1371|3145->1424|3174->1425|3276->1499|3305->1500|3351->1518|3493->1632|3522->1633|3564->1647|3615->1670|3644->1671|3690->1689|3827->1798|3856->1799|3906->1821|3935->1822|3981->1840|4052->1883|4081->1884|4118->1894|4147->1895|4238->1959|4266->1960|4316->1980
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|36->9|36->9|38->11|53->26|53->26|55->28|58->31|58->31|59->32|60->33|61->34|61->34|61->34|63->36|63->36|64->37|64->37|64->37|65->38|67->40|67->40|68->41|68->41|69->42|69->42|69->42|70->43|71->44|71->44|72->45|73->46|73->46|76->49|76->49|77->50|79->52|79->52|80->53|81->54|81->54|82->55|85->58|85->58|86->59|86->59|87->60|88->61|88->61|89->62|89->62|93->66|93->66|96->69
                  -- GENERATED --
              */
          