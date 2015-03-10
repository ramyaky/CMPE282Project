
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
object IndividualCow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("Welcome to My Play")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""

  """),format.raw/*5.3*/("""<section id="container" >

"""),_display_(/*7.2*/commonTemplate()),format.raw/*7.18*/("""

      """),format.raw/*9.7*/("""<section id="main-content">
          <section class="wrapper site-min-height">
          	<h3><i class="fa fa-angle-right"></i> Details Page</h3>
          	<div class="row mt">
          		<div class="col-lg-12">
          		<script type="text/javascript" src=""""),_display_(/*14.50*/routes/*14.56*/.Application.javascriptRoutes),format.raw/*14.85*/(""""></script>         		
          		<p>Please Select Individual Cow to view detailed report</p>
          		<select class="form-control" id="cowIdentifier" onchange="cowDetails()">
          		          <option>-----Select the Cow----</option>
						  <option value="1">1</option>
						  <option value="2">2</option>
						  <option value="3">3</option>
						  <option value="4">4</option>
						  <option value="5">5</option>
				</select>
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
                              <h4><i class="fa fa-angle-right"></i> Chart Example 2</h4>
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

"""),_display_(/*59.2*/footer()),format.raw/*59.10*/("""

  """),format.raw/*61.3*/("""</section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script type="text/javascript" charset="utf-8">
	      var cowDetails = function() """),format.raw/*65.36*/("""{"""),format.raw/*65.37*/("""
		      """),format.raw/*66.9*/("""var cowValue = $('#cowIdentifier').val();
		      jsRoutes.controllers.Application.viewIndividualCow(cowValue).ajax("""),format.raw/*67.75*/("""{"""),format.raw/*67.76*/("""
		        """),format.raw/*68.11*/("""success: function(tempData) """),format.raw/*68.39*/("""{"""),format.raw/*68.40*/("""
			        """),format.raw/*69.12*/("""var tempData2 = JSON.parse(tempData);
		        	Morris.Bar("""),format.raw/*70.23*/("""{"""),format.raw/*70.24*/("""
			            """),format.raw/*71.16*/("""element: 'hero-bar',
			            data: tempData2,
			            xkey: 'time',
			            ykeys: ['Temperature'],
			            labels: ['Temperature'],
			            barRatio: 0.2,
			            xLabelAngle: 35,
			            hideHover: 'auto',
			            barColors: ['#ac92ec']
			          """),format.raw/*80.14*/("""}"""),format.raw/*80.15*/(""");
		          $("#result").html(data);
		        """),format.raw/*82.11*/("""}"""),format.raw/*82.12*/(""",
		        error: function() """),format.raw/*83.29*/("""{"""),format.raw/*83.30*/("""
		          """),format.raw/*84.13*/("""alert("Error!")
		        """),format.raw/*85.11*/("""}"""),format.raw/*85.12*/("""
		      """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/(""")
	    """),format.raw/*87.6*/("""}"""),format.raw/*87.7*/("""; 	 

     </script>

""")))}),format.raw/*91.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 09 18:32:36 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/IndividualCow.scala.html
                  HASH: ee2bb795e1de3453bc58e26a0b4071afe3caf6ed
                  MATRIX: 844->44|878->70|917->72|949->78|1004->108|1040->124|1076->134|1372->403|1387->409|1437->438|3300->2275|3329->2283|3362->2289|3568->2467|3597->2468|3634->2478|3779->2595|3808->2596|3848->2608|3904->2636|3933->2637|3974->2650|4063->2711|4092->2712|4137->2729|4482->3046|4511->3047|4591->3099|4620->3100|4679->3131|4708->3132|4750->3146|4805->3173|4834->3174|4871->3184|4900->3185|4935->3193|4963->3194|5020->3221
                  LINES: 29->3|29->3|29->3|31->5|33->7|33->7|35->9|40->14|40->14|40->14|85->59|85->59|87->61|91->65|91->65|92->66|93->67|93->67|94->68|94->68|94->68|95->69|96->70|96->70|97->71|106->80|106->80|108->82|108->82|109->83|109->83|110->84|111->85|111->85|112->86|112->86|113->87|113->87|117->91
                  -- GENERATED --
              */
          