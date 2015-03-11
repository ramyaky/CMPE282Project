
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
                  <select class="form-control" id="cowIdentifier" onchange="cowDetails();cowDetails1();cowDetails2()">
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
                      <div class="col-lg-12">
                          <div class="content-panel">
                              <h4><i class="fa fa-angle-right"></i> Temperature Vs Heat Index</h4>
                              <div class="panel-body">
                                  <div id="chartContainer" class="graph"></div>
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

"""),_display_(/*70.2*/footer()),format.raw/*70.10*/("""

  """),format.raw/*72.3*/("""</section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script type="text/javascript" charset="utf-8">
	      var cowDetails = function() """),format.raw/*76.36*/("""{"""),format.raw/*76.37*/("""
              """),format.raw/*77.15*/("""$("#hero-bar").empty();
		      var cowValue = $('#cowIdentifier').val();
		      jsRoutes.controllers.Application.viewIndividualCow(cowValue).ajax("""),format.raw/*79.75*/("""{"""),format.raw/*79.76*/("""
		        """),format.raw/*80.11*/("""success: function(tempData) """),format.raw/*80.39*/("""{"""),format.raw/*80.40*/("""
			        """),format.raw/*81.12*/("""var tempData2 = JSON.parse(tempData);
		        	Morris.Bar("""),format.raw/*82.23*/("""{"""),format.raw/*82.24*/("""
			            """),format.raw/*83.16*/("""element: 'hero-bar',
			            data: tempData2,
			            xkey: 'time',
			            ykeys: ['Temperature'],
			            labels: ['Temperature'],
			            barRatio: 0.2,
			            xLabelAngle: 8,
			            hideHover: 'auto',
			            barColors: ['#ac92ec']
			          """),format.raw/*92.14*/("""}"""),format.raw/*92.15*/(""");
		          $("#result").html(data);
		        """),format.raw/*94.11*/("""}"""),format.raw/*94.12*/(""",
		        error: function() """),format.raw/*95.29*/("""{"""),format.raw/*95.30*/("""
		          """),format.raw/*96.13*/("""alert("Error!")
		        """),format.raw/*97.11*/("""}"""),format.raw/*97.12*/("""
		      """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/(""")
	    """),format.raw/*99.6*/("""}"""),format.raw/*99.7*/("""; 	 

    var cowDetails1 = function() """),format.raw/*101.34*/("""{"""),format.raw/*101.35*/("""
              """),format.raw/*102.15*/("""$("#hero-area").empty();
              var cowValue = $('#cowIdentifier').val();
              jsRoutes.controllers.Application.secondGraph(cowValue).ajax("""),format.raw/*104.75*/("""{"""),format.raw/*104.76*/("""
                    """),format.raw/*105.21*/("""success: function(tempData) """),format.raw/*105.49*/("""{"""),format.raw/*105.50*/("""
                        """),format.raw/*106.25*/("""var tempData2 = JSON.parse(tempData);
                        Morris.Bar("""),format.raw/*107.36*/("""{"""),format.raw/*107.37*/("""
                            """),format.raw/*108.29*/("""element: 'hero-area',
                            data: tempData2,
                            xkey: 'time',
                            ykeys: ['Temperature'],
                            labels: ['Temperature'],
                            barRatio: 0.2,
                            xLabelAngle: 8,
                            hideHover: 'auto',
                            barColors: ['#ac92ec']
                          """),format.raw/*117.27*/("""}"""),format.raw/*117.28*/("""); 
                        /* Morris.Line("""),format.raw/*118.40*/("""{"""),format.raw/*118.41*/("""
                            """),format.raw/*119.29*/("""element: 'hero-line',
                            data: tempData2,
                            xkey: 'time',
                            ykeys: ['Temperature'],
                            labels: ['Temperature']
                          """),format.raw/*124.27*/("""}"""),format.raw/*124.28*/("""); */
                      $("#result").html(data);
                    """),format.raw/*126.21*/("""}"""),format.raw/*126.22*/(""",
                    error: function() """),format.raw/*127.39*/("""{"""),format.raw/*127.40*/("""
                      """),format.raw/*128.23*/("""alert("Error!")
                    """),format.raw/*129.21*/("""}"""),format.raw/*129.22*/("""
                  """),format.raw/*130.19*/("""}"""),format.raw/*130.20*/(""")
              
              
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/(""";

    var cowDetails2 = function() """),format.raw/*135.34*/("""{"""),format.raw/*135.35*/("""
              """),format.raw/*136.15*/("""var cowValue = $('#cowIdentifier').val();
              jsRoutes.controllers.Application.thirdGraph(cowValue).ajax("""),format.raw/*137.74*/("""{"""),format.raw/*137.75*/("""
                    """),format.raw/*138.21*/("""success: function(tempData) """),format.raw/*138.49*/("""{"""),format.raw/*138.50*/("""
                        """),format.raw/*139.25*/("""var tempData2 = JSON.parse(tempData);
                        var a = tempData2;
                        
                         for(var i = 0; i < a.length; i++) """),format.raw/*142.60*/("""{"""),format.raw/*142.61*/("""
                              """),format.raw/*143.31*/("""var b = a[i];
                              for(var k in b) """),format.raw/*144.47*/("""{"""),format.raw/*144.48*/("""
                                  """),format.raw/*145.35*/("""if(k == "y") """),format.raw/*145.48*/("""{"""),format.raw/*145.49*/("""
                                      """),format.raw/*146.39*/("""b[k] = parseInt(b[k]);
                                  """),format.raw/*147.35*/("""}"""),format.raw/*147.36*/("""
                                  """),format.raw/*148.35*/("""if(k == "x") """),format.raw/*148.48*/("""{"""),format.raw/*148.49*/("""
                                      """),format.raw/*149.39*/("""b[k] = parseInt(b[k]);
                                  """),format.raw/*150.35*/("""}"""),format.raw/*150.36*/("""
                              """),format.raw/*151.31*/("""}"""),format.raw/*151.32*/("""
                        """),format.raw/*152.25*/("""}"""),format.raw/*152.26*/(""" 
                        """),format.raw/*153.25*/("""var x = ["""),format.raw/*153.34*/("""{"""),format.raw/*153.35*/("""x:81.056,y:70"""),format.raw/*153.48*/("""}"""),format.raw/*153.49*/(""", """),format.raw/*153.51*/("""{"""),format.raw/*153.52*/("""x:74.83200000000001,y:69"""),format.raw/*153.76*/("""}"""),format.raw/*153.77*/(""", """),format.raw/*153.79*/("""{"""),format.raw/*153.80*/("""x:79.58,y:133"""),format.raw/*153.93*/("""}"""),format.raw/*153.94*/(""", """),format.raw/*153.96*/("""{"""),format.raw/*153.97*/("""x:79.58,y:133"""),format.raw/*153.110*/("""}"""),format.raw/*153.111*/(""", """),format.raw/*153.113*/("""{"""),format.raw/*153.114*/("""x:79.58,y:133"""),format.raw/*153.127*/("""}"""),format.raw/*153.128*/(""", """),format.raw/*153.130*/("""{"""),format.raw/*153.131*/("""x:79.58,y:133"""),format.raw/*153.144*/("""}"""),format.raw/*153.145*/(""", """),format.raw/*153.147*/("""{"""),format.raw/*153.148*/("""x:75.64999999999999,y:68"""),format.raw/*153.172*/("""}"""),format.raw/*153.173*/(""", """),format.raw/*153.175*/("""{"""),format.raw/*153.176*/("""x:79.58,y:133"""),format.raw/*153.189*/("""}"""),format.raw/*153.190*/(""", """),format.raw/*153.192*/("""{"""),format.raw/*153.193*/("""x:79.58,y:133"""),format.raw/*153.206*/("""}"""),format.raw/*153.207*/(""", """),format.raw/*153.209*/("""{"""),format.raw/*153.210*/("""x:79.58,y:133"""),format.raw/*153.223*/("""}"""),format.raw/*153.224*/("""];

                        var chart = new CanvasJS.Chart("chartContainer",
                                """),format.raw/*156.33*/("""{"""),format.raw/*156.34*/("""
                                  """),format.raw/*157.35*/("""title:"""),format.raw/*157.41*/("""{"""),format.raw/*157.42*/("""
                                  """),format.raw/*158.35*/("""text: "Temperature Vs Heat Index"
                                  """),format.raw/*159.35*/("""}"""),format.raw/*159.36*/(""",
                                  axisX: """),format.raw/*160.42*/("""{"""),format.raw/*160.43*/("""
                                    """),format.raw/*161.37*/("""minimum: 70,
                                    maximum: 136,
                                    interval:10
                                  """),format.raw/*164.35*/("""}"""),format.raw/*164.36*/(""",
                                  axisY:"""),format.raw/*165.41*/("""{"""),format.raw/*165.42*/("""
                                    """),format.raw/*166.37*/("""includeZero: true
                                  """),format.raw/*167.35*/("""}"""),format.raw/*167.36*/(""",
                                  data: [
                                  """),format.raw/*169.35*/("""{"""),format.raw/*169.36*/("""
                                    """),format.raw/*170.37*/("""type: "line",
                                    dataPoints: a
                                  """),format.raw/*172.35*/("""}"""),format.raw/*172.36*/("""
                                  """),format.raw/*173.35*/("""]
                                """),format.raw/*174.33*/("""}"""),format.raw/*174.34*/(""");

                                chart.render();
                      $("#result").html(data);
                    """),format.raw/*178.21*/("""}"""),format.raw/*178.22*/(""",
                    error: function() """),format.raw/*179.39*/("""{"""),format.raw/*179.40*/("""
                      """),format.raw/*180.23*/("""alert("Error!")
                    """),format.raw/*181.21*/("""}"""),format.raw/*181.22*/("""
                  """),format.raw/*182.19*/("""}"""),format.raw/*182.20*/(""")
              
              
        """),format.raw/*185.9*/("""}"""),format.raw/*185.10*/(""";    

     </script>

""")))}),format.raw/*189.2*/("""
"""))}
  }

  def render(noOfCowsInCattle:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(noOfCowsInCattle)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (noOfCowsInCattle) => apply(noOfCowsInCattle)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 01:09:38 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/IndividualCow.scala.html
                  HASH: f3a52707dadb623fc1384d85a33e2e10fc2307b8
                  MATRIX: 775->44|895->76|925->81|959->107|998->109|1030->115|1085->145|1121->161|1158->171|1467->453|1482->459|1532->488|1887->816|1924->844|1963->845|2025->880|2088->927|2128->929|2188->961|2231->977|2274->999|2304->1002|2347->1024|2420->1066|2480->1095|2526->1113|4461->3022|4490->3030|4523->3036|4729->3214|4758->3215|4802->3231|4980->3381|5009->3382|5049->3394|5105->3422|5134->3423|5175->3436|5264->3497|5293->3498|5338->3515|5682->3831|5711->3832|5791->3884|5820->3885|5879->3916|5908->3917|5950->3931|6005->3958|6034->3959|6071->3969|6100->3970|6135->3978|6163->3979|6233->4020|6263->4021|6308->4037|6494->4194|6524->4195|6575->4217|6632->4245|6662->4246|6717->4272|6820->4346|6850->4347|6909->4377|7372->4811|7402->4812|7475->4856|7505->4857|7564->4887|7837->5131|7867->5132|7971->5207|8001->5208|8071->5249|8101->5250|8154->5274|8220->5311|8250->5312|8299->5332|8329->5333|8400->5376|8430->5377|8497->5415|8527->5416|8572->5432|8717->5548|8747->5549|8798->5571|8855->5599|8885->5600|8940->5626|9137->5794|9167->5795|9228->5827|9318->5888|9348->5889|9413->5925|9455->5938|9485->5939|9554->5979|9641->6037|9671->6038|9736->6074|9778->6087|9808->6088|9877->6128|9964->6186|9994->6187|10055->6219|10085->6220|10140->6246|10170->6247|10226->6274|10264->6283|10294->6284|10336->6297|10366->6298|10397->6300|10427->6301|10480->6325|10510->6326|10541->6328|10571->6329|10613->6342|10643->6343|10674->6345|10704->6346|10747->6359|10778->6360|10810->6362|10841->6363|10884->6376|10915->6377|10947->6379|10978->6380|11021->6393|11052->6394|11084->6396|11115->6397|11169->6421|11200->6422|11232->6424|11263->6425|11306->6438|11337->6439|11369->6441|11400->6442|11443->6455|11474->6456|11506->6458|11537->6459|11580->6472|11611->6473|11752->6585|11782->6586|11847->6622|11882->6628|11912->6629|11977->6665|12075->6734|12105->6735|12178->6779|12208->6780|12275->6818|12452->6966|12482->6967|12554->7010|12584->7011|12651->7049|12733->7102|12763->7103|12872->7183|12902->7184|12969->7222|13098->7322|13128->7323|13193->7359|13257->7394|13287->7395|13439->7518|13469->7519|13539->7560|13569->7561|13622->7585|13688->7622|13718->7623|13767->7643|13797->7644|13868->7687|13898->7688|13957->7716
                  LINES: 26->3|29->3|31->5|31->5|31->5|33->7|35->9|35->9|37->11|42->16|42->16|42->16|46->20|46->20|46->20|47->21|47->21|47->21|48->22|48->22|48->22|48->22|48->22|49->23|50->24|51->25|96->70|96->70|98->72|102->76|102->76|103->77|105->79|105->79|106->80|106->80|106->80|107->81|108->82|108->82|109->83|118->92|118->92|120->94|120->94|121->95|121->95|122->96|123->97|123->97|124->98|124->98|125->99|125->99|127->101|127->101|128->102|130->104|130->104|131->105|131->105|131->105|132->106|133->107|133->107|134->108|143->117|143->117|144->118|144->118|145->119|150->124|150->124|152->126|152->126|153->127|153->127|154->128|155->129|155->129|156->130|156->130|159->133|159->133|161->135|161->135|162->136|163->137|163->137|164->138|164->138|164->138|165->139|168->142|168->142|169->143|170->144|170->144|171->145|171->145|171->145|172->146|173->147|173->147|174->148|174->148|174->148|175->149|176->150|176->150|177->151|177->151|178->152|178->152|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|179->153|182->156|182->156|183->157|183->157|183->157|184->158|185->159|185->159|186->160|186->160|187->161|190->164|190->164|191->165|191->165|192->166|193->167|193->167|195->169|195->169|196->170|198->172|198->172|199->173|200->174|200->174|204->178|204->178|205->179|205->179|206->180|207->181|207->181|208->182|208->182|211->185|211->185|215->189
                  -- GENERATED --
              */
          