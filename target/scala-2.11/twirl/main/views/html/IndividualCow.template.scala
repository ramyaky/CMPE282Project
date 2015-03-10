
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
import controllers.routes.javascript._
/**/
object IndividualCow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(noOfCowsInCattle: List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.34*/("""

"""),_display_(/*5.2*/main("Welcome to My Play")/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""

  """),format.raw/*7.3*/("""<section id="container" >

"""),_display_(/*9.2*/commonTemplate()),format.raw/*9.18*/("""

      """),format.raw/*11.7*/("""<section id="main-content">
          <section class="wrapper site-min-height">
          	<h3><i class="fa fa-angle-right"></i> Details Page</h3>
            <div class="row mt">
                  <div class="col-lg-12">
                  <script type="text/javascript" src=""""),_display_(/*16.56*/routes/*16.62*/.Application.javascriptRoutes),format.raw/*16.91*/(""""></script>                 
                  <p>Please Select Individual Cow to view detailed report</p>
                  <select class="form-control" id="cowIdentifier" onchange="cowDetails();cowDetails1()">
                            <option>-----Select the Cow----</option>
                            """),_display_(/*20.30*/if(noOfCowsInCattle != null)/*20.58*/{_display_(Seq[Any](format.raw/*20.59*/("""  
                              """),_display_(/*21.32*/for(singlenoOfCowsInCattle <- noOfCowsInCattle) yield /*21.79*/ {_display_(Seq[Any](format.raw/*21.81*/("""
                              """),format.raw/*22.31*/("""<option value=""""),_display_(/*22.47*/singlenoOfCowsInCattle),format.raw/*22.69*/("""">"""),_display_(/*22.72*/singlenoOfCowsInCattle),format.raw/*22.94*/("""</option>
                              """)))}),format.raw/*23.32*/("""
                          """)))}),format.raw/*24.28*/("""
                """),format.raw/*25.17*/("""</select>
                  </div>
              </div>	
			 <div id="morris">
                  <div class="row mt">
                      <div class="col-lg-6">
                          <div class="content-panel">
                              <h4><i class="fa fa-angle-right"></i> Cow Temperature for today</h4>
                              <div class="panel-body">
                                  <div id="hero-bar" class="graph"></div>
                              </div>
                          </div>
                      </div>
                      <div class="col-lg-6">
                          <div class="content-panel">
                              <h4><i class="fa fa-angle-right"></i> Recent Four Records </h4>
                              <div class="panel-body">
                                  <div id="hero-area" class="graph"></div>
                              </div>
                          </div>
                      </div>
                  </div>
                  <div class="row mt">
                      <div class="col-lg-6">
                          
                      </div>
                      <div class="col-lg-6">
                          
                      </div>
                  </div>
              </div>
              <!-- page end-->
		</section>
      </section><!-- /MAIN CONTENT -->

"""),_display_(/*60.2*/footer()),format.raw/*60.10*/("""

  """),format.raw/*62.3*/("""</section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script type="text/javascript" charset="utf-8">
	      var cowDetails = function() """),format.raw/*66.36*/("""{"""),format.raw/*66.37*/("""
              """),format.raw/*67.15*/("""$("#hero-bar").empty();
		      var cowValue = $('#cowIdentifier').val();
		      jsRoutes.controllers.Application.viewIndividualCow(cowValue).ajax("""),format.raw/*69.75*/("""{"""),format.raw/*69.76*/("""
		        """),format.raw/*70.11*/("""success: function(tempData) """),format.raw/*70.39*/("""{"""),format.raw/*70.40*/("""
			        """),format.raw/*71.12*/("""var tempData2 = JSON.parse(tempData);
		        	Morris.Bar("""),format.raw/*72.23*/("""{"""),format.raw/*72.24*/("""
			            """),format.raw/*73.16*/("""element: 'hero-bar',
			            data: tempData2,
			            xkey: 'time',
			            ykeys: ['Temperature'],
			            labels: ['Temperature'],
			            barRatio: 0.2,
			            xLabelAngle: 8,
			            hideHover: 'auto',
			            barColors: ['#ac92ec']
			          """),format.raw/*82.14*/("""}"""),format.raw/*82.15*/(""");
		          $("#result").html(data);
		        """),format.raw/*84.11*/("""}"""),format.raw/*84.12*/(""",
		        error: function() """),format.raw/*85.29*/("""{"""),format.raw/*85.30*/("""
		          """),format.raw/*86.13*/("""alert("Error!")
		        """),format.raw/*87.11*/("""}"""),format.raw/*87.12*/("""
		      """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/(""")
	    """),format.raw/*89.6*/("""}"""),format.raw/*89.7*/("""; 	 

    var cowDetails1 = function() """),format.raw/*91.34*/("""{"""),format.raw/*91.35*/("""
              """),format.raw/*92.15*/("""$("#hero-area").empty();
              var cowValue = $('#cowIdentifier').val();
              jsRoutes.controllers.Application.secondGraph(cowValue).ajax("""),format.raw/*94.75*/("""{"""),format.raw/*94.76*/("""
                    """),format.raw/*95.21*/("""success: function(tempData) """),format.raw/*95.49*/("""{"""),format.raw/*95.50*/("""
                        """),format.raw/*96.25*/("""var tempData2 = JSON.parse(tempData);
                        Morris.Bar("""),format.raw/*97.36*/("""{"""),format.raw/*97.37*/("""
                            """),format.raw/*98.29*/("""element: 'hero-area',
                            data: tempData2,
                            xkey: 'time',
                            ykeys: ['Temperature'],
                            labels: ['Temperature'],
                            barRatio: 0.2,
                            xLabelAngle: 8,
                            hideHover: 'auto',
                            barColors: ['#ac92ec']
                          """),format.raw/*107.27*/("""}"""),format.raw/*107.28*/("""); 
                        /* Morris.Line("""),format.raw/*108.40*/("""{"""),format.raw/*108.41*/("""
                            """),format.raw/*109.29*/("""element: 'hero-line',
                            data: tempData2,
                            xkey: 'time',
                            ykeys: ['Temperature'],
                            labels: ['Temperature']
                          """),format.raw/*114.27*/("""}"""),format.raw/*114.28*/("""); */
                      $("#result").html(data);
                    """),format.raw/*116.21*/("""}"""),format.raw/*116.22*/(""",
                    error: function() """),format.raw/*117.39*/("""{"""),format.raw/*117.40*/("""
                      """),format.raw/*118.23*/("""alert("Error!")
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/("""
                  """),format.raw/*120.19*/("""}"""),format.raw/*120.20*/(""")
              
              
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/(""";

     </script>

""")))}),format.raw/*127.2*/("""
"""))}
  }

  def render(noOfCowsInCattle:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(noOfCowsInCattle)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (noOfCowsInCattle) => apply(noOfCowsInCattle)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 15:58:58 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/IndividualCow.scala.html
                  HASH: 50d2ced5d1dccb6b691901b44c24670a31a9959a
                  MATRIX: 775->44|895->76|925->81|959->107|998->109|1030->115|1085->145|1121->161|1158->171|1467->453|1482->459|1532->488|1873->802|1910->830|1949->831|2011->866|2074->913|2114->915|2174->947|2217->963|2260->985|2290->988|2333->1010|2406->1052|2466->1081|2512->1099|3936->2497|3965->2505|3998->2511|4204->2689|4233->2690|4277->2706|4455->2856|4484->2857|4524->2869|4580->2897|4609->2898|4650->2911|4739->2972|4768->2973|4813->2990|5157->3306|5186->3307|5266->3359|5295->3360|5354->3391|5383->3392|5425->3406|5480->3433|5509->3434|5546->3444|5575->3445|5610->3453|5638->3454|5707->3495|5736->3496|5780->3512|5965->3669|5994->3670|6044->3692|6100->3720|6129->3721|6183->3747|6285->3821|6314->3822|6372->3852|6835->4286|6865->4287|6938->4331|6968->4332|7027->4362|7300->4606|7330->4607|7434->4682|7464->4683|7534->4724|7564->4725|7617->4749|7683->4786|7713->4787|7762->4807|7792->4808|7863->4851|7893->4852|7948->4876
                  LINES: 26->3|29->3|31->5|31->5|31->5|33->7|35->9|35->9|37->11|42->16|42->16|42->16|46->20|46->20|46->20|47->21|47->21|47->21|48->22|48->22|48->22|48->22|48->22|49->23|50->24|51->25|86->60|86->60|88->62|92->66|92->66|93->67|95->69|95->69|96->70|96->70|96->70|97->71|98->72|98->72|99->73|108->82|108->82|110->84|110->84|111->85|111->85|112->86|113->87|113->87|114->88|114->88|115->89|115->89|117->91|117->91|118->92|120->94|120->94|121->95|121->95|121->95|122->96|123->97|123->97|124->98|133->107|133->107|134->108|134->108|135->109|140->114|140->114|142->116|142->116|143->117|143->117|144->118|145->119|145->119|146->120|146->120|149->123|149->123|153->127
                  -- GENERATED --
              */
          