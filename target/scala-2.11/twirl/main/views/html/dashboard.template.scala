
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,String,String,String,String,String,String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, noOfCowsInCattle: String , statusOk: String, noOfSickCows: String, jsonResult: String, heatIndex : String, myjsonResult: String, notify : List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.171*/("""

"""),_display_(/*3.2*/main("Cattle Center Dashboard")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

    """),format.raw/*5.5*/("""<section id="container">

"""),_display_(/*7.2*/commonTemplate()),format.raw/*7.18*/("""

"""),format.raw/*9.1*/("""<section id="main-content">
          <section class="wrapper">

              <div class="row">
                  <div class="col-lg-9 main-chart">
                  
                  <div class="row mtbox">
                          <div class="col-md-3 col-sm-3 col-md-offset-1 box0">
                              <div class="box1">
                              <img alt="Relax" src=""""),_display_(/*18.54*/routes/*18.60*/.Assets.at("images/cutie_burned.png")),format.raw/*18.97*/("""" style="width:100px;height:120px;">
                                  <!-- <span class="li_heart"></span> -->
                                  <h3>"""),_display_(/*20.40*/noOfCowsInCattle),format.raw/*20.56*/("""</h3>
                              </div>
                                  <p>Number of cows in cattle center as of today</p>
                          </div>
                          <div class="col-md-2 col-sm-2 box0">
                              <div class="box1">
                              <img alt="weatherImage" id="displayImage" src="" style="width:100px;height:120px;">
                                  <!-- <span class="li_cloud"></span> -->
                                   <h3 id="weathervalue"></h3>
                              </div>
                                  <p>Local Weather</p>
                          </div>
                          <!--  <div class="col-md-2 col-sm-2 box0">
                              <div class="box1">
                                   <span class="li_stack"></span>
                                  <h3>23</h3> 
                              </div>
                               <p>Number of cows cured from BRD</p>
                          </div> -->
                          <div class="col-md-2 col-sm-2 box0">
                              <div class="box1">
                              <img alt="Relax" src=""""),_display_(/*41.54*/routes/*41.60*/.Assets.at("images/crying.png")),format.raw/*41.91*/("""" style="width:100px;height:120px;">
                                  <!-- <span class="li_news"></span> -->
                                  <h3>"""),_display_(/*43.40*/noOfSickCows),format.raw/*43.52*/("""</h3>
                              </div>
                                  <p>Cows experiencing abnormal body temperatures!</p>
                          </div>
                          """),_display_(/*47.28*/if(statusOk == "Abnormal")/*47.54*/{_display_(Seq[Any](format.raw/*47.55*/("""
                          """),format.raw/*48.27*/("""<div class="col-md-3 col-sm-3 box0">
                              <div class="box1">
                              <img alt="Relax" src=""""),_display_(/*50.54*/routes/*50.60*/.Assets.at("images/angryCow.png")),format.raw/*50.93*/("""" style="width:100px;height:120px;">
                                  <!-- <span style="background-image: url(assets/img/Relax.jpg)"></span> -->
                                  <h3 style="font-family: sans-serif;">"""),_display_(/*52.73*/statusOk),format.raw/*52.81*/("""</h3>
                              </div>
                                  <p>Your Cattle is experiencing abnormalities.</p>
                          </div>
                          """)))}/*56.28*/else/*56.32*/{_display_(Seq[Any](format.raw/*56.33*/("""
                          """),format.raw/*57.27*/("""<div class="col-md-3 col-sm-3 box0">
                              <div class="box1">
                              <img alt="Relax" src=""""),_display_(/*59.54*/routes/*59.60*/.Assets.at("images/Relax_burned.png")),format.raw/*59.97*/("""" style="width:100px;height:120px;">
                                  <!-- <span style="background-image: url(assets/img/Relax.jpg)"></span> -->
                                  <h3>"""),_display_(/*61.40*/statusOk),format.raw/*61.48*/("""</h3>
                              </div>
                                  <p>Your Cattle is working perfectly. Relax & enjoy.</p>
                          </div>
                          """)))}),format.raw/*65.28*/("""
                      
                      """),format.raw/*67.23*/("""</div><!-- /row mt -->        
                  
                      
                    <div class="row">
                        <!-- TWITTER PANEL -->
                        <div class="col-md-4 mb">
                              <div class="darkblue-panel pn" style="height:400px;">
                                  <div class="darkblue-header">
                                      <h5>Heat Index: NOAA via Wikipedia</h5>
                                  </div>
                                <!-- <canvas id="serverstatus02" height="120" width="120"></canvas>
                                <script>
                                    var doughnutData = [
                                            """),format.raw/*80.45*/("""{"""),format.raw/*80.46*/("""
                                                """),format.raw/*81.49*/("""value: 60,
                                                color:"#68dff0"
                                            """),format.raw/*83.45*/("""}"""),format.raw/*83.46*/(""",
                                            """),format.raw/*84.45*/("""{"""),format.raw/*84.46*/("""
                                                """),format.raw/*85.49*/("""value : 40,
                                                color : "#444c57"
                                            """),format.raw/*87.45*/("""}"""),format.raw/*87.46*/("""
                                        """),format.raw/*88.41*/("""];
                                        var myDoughnut = new Chart(document.getElementById("serverstatus02").getContext("2d")).Doughnut(doughnutData);
                                </script> 
                                <p>April 17, 2014</p>
                                <footer>
                                    <div class="pull-left">
                                        <h5><i class="fa fa-hdd-o"></i> 17 GB</h5>
                                    </div>
                                    <div class="pull-right">
                                        <h5>60% Used</h5>
                                    </div>
                                </footer>-->
                                <img alt="Relax" src=""""),_display_(/*100.56*/routes/*100.62*/.Assets.at("images/THIndex.png")),format.raw/*100.94*/("""" style="width:300px;height:300px;">
                              </div>
                        </div><!-- /col-md-4 -->
                        
                        
                        <div class="col-md-4 mb">
                            <!-- INSTAGRAM PANEL -->
                            <div class="darkblue-panel pn" style="height:400px;">
                                <div class="darkblue-header">
                                      <h5>Recent Heat Index</h5>
                                  </div>
                                  <div style="font-size: xx-large;color: #FF865C;padding-top: 100px;">
                                  """),_display_(/*112.36*/heatIndex),format.raw/*112.45*/("""
                                  """),format.raw/*113.35*/("""</div>
                                <!-- <canvas id="bar1" height="300" width="300"></canvas>
                                <script>
                                var chartvalues = """),_display_(/*116.52*/jsonResult),format.raw/*116.62*/(""";
                                var arr = chartvalues;
                                var labl = ["Slot1","Slot2","Slot3","Slot4"]
                                    var barChartData = """),format.raw/*119.56*/("""{"""),format.raw/*119.57*/("""
                                            """),format.raw/*120.45*/("""labels : labl,
                                            datasets : [
                                                """),format.raw/*122.49*/("""{"""),format.raw/*122.50*/("""
                                                    """),format.raw/*123.53*/("""fillColor : "rgba(220,220,220,0.5)",
                                                    strokeColor : "rgba(220,220,220,1)",
                                                    data : arr
                                                """),format.raw/*126.49*/("""}"""),format.raw/*126.50*/("""
                                            """),format.raw/*127.45*/("""]

                                        """),format.raw/*129.41*/("""}"""),format.raw/*129.42*/(""";
                                        var mybar = new Chart(document.getElementById("bar1").getContext("2d")).Bar(barChartData); 
                                    

                                </script> -->
                            </div>
                        </div><!-- /col-md-4 -->
                        
                        <div class="col-md-4 col-sm-4 mb">
                            <!-- REVENUE PANEL -->
                            <div class="darkblue-panel pn" style="height:400px;">
                                <div class="darkblue-header">
                                    <h5>REVENUE</h5>
                                </div>
                                <div class="chart mt">
                                <!-- <iframe src="http://free.timeanddate.com/countdown/i4kqqwpd/n283/cf13/cm0/cu4/ct3/cs0/ca0/co1/cr0/ss0/cacfff/cpcfff/pct/tcfff/fs110/szw448/szh189/tat/tacfff/tpt/tpcfff/iso2015-03-08T00:00:00" allowTransparency="true" frameborder="0" width="230" height="135"></iframe> -->
                                    <div class="sparkline" data-type="line" data-resize="true" data-height="75" data-width="90%" data-line-width="1" data-line-color="#fff" data-spot-color="#fff" data-fill-color="" data-highlight-line-color="#fff" data-spot-radius="4" data-data=""""),_display_(/*145.281*/jsonResult),format.raw/*145.291*/("""">></div>
                                </div>
                                <p class="mt"><b>$ 17,980</b><br/>Month Income</p>
                            </div>
                        </div><!-- /col-md-4 -->
                        
                    </div><!-- /row -->
                    
                    <div class="row mt">
                      <!--CUSTOM CHART START -->
                      <div class="col-md-12 col-sm-12 mb">
                      <div class="border-head">
                          <h3>VISITS</h3>
                      </div>
                      <div id="bar-example" class="custom-bar-chart">
                      </div>
                      </div>
                      <!--custom chart end-->
                    </div><!-- /row -->    
                    
                  </div><!-- /col-lg-9 END SECTION MIDDLE -->
                  
                  
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
                  
                  <div class="col-lg-3 ds">
                    <!--COMPLETED ACTIONS DONUTS CHART-->
                        <h3>Notifications</h3>
                                      """),_display_(/*175.40*/if(notify != null)/*175.58*/{_display_(Seq[Any](format.raw/*175.59*/("""  
                                        """),_display_(/*176.42*/for(singleNotify <- notify) yield /*176.69*/ {_display_(Seq[Any](format.raw/*176.71*/("""
 
                      """),format.raw/*178.23*/("""<!-- First Action -->
                      <div class="desc">
                          <div class="thumb">
                              <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                          </div>
                          <div class="details">
                              <p><muted>2 Minutes Ago</muted><br/> 
                                 <a href="#">"""),_display_(/*185.47*/singleNotify),format.raw/*185.59*/("""</a><br/>
                              </p>
                          </div>
                      </div>
                      """)))}),format.raw/*189.24*/("""
                      """)))}),format.raw/*190.24*/("""
                     """),format.raw/*191.22*/("""<!--  <!-- Second Action 
                      <div class="desc">
                          <div class="thumb">
                              <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                          </div>
                          <div class="details">
                              <p><muted>3 Hours Ago</muted><br/>
                                 <a href="#">Cow 3</a> experienced sudden rise in its body temperature<br/>
                              </p>
                          </div>
                      </div> -->
                      
                       <!-- USERS ONLINE SECTION -->
                        <h3>Treatments offered for BRD in Metaphylaxis</h3>
                      <!-- First Member -->
                      <div class="desc">
                          <div class="thumb">
                          </div>
                          <div class="details">
                              <p><a href="#">Micotil® (tilmicosin)</a><br/>
                                 <muted>Cost to treat a 500-pound calf - $8.00</muted>
                              </p>
                          </div>
                      </div>
                      <!-- Second Member -->
                      <div class="desc">
                          <div class="thumb">
                          </div>
                          <div class="details">
                              <p><a href="#">Nuflor® (florphenicol)</a><br/>
                                 <muted>Cost to treat a 500-pound calf - $15.00</muted>
                              </p>
                          </div>
                      </div>
                      <!-- Third Member -->
                      <div class="desc">
                          <div class="thumb">
                          </div>
                          <div class="details">
                              <p><a href="#">Tetradure® (oxytetracycline 300 mg/ml)</a><br/>
                                 <muted>Cost to treat a 500-pound calf - ($4.05 - $6.02)</muted>
                              </p>
                          </div>
                      </div>
                      <!-- Fourth Member -->
                      <div class="desc">
                          <div class="thumb">
                          </div>
                          <div class="details">
                              <p><a href="#">Excede® (ceftiofur 200mg/ml)</a><br/>
                                 <muted>Cost to treat a 500-pound calf - $13.12</muted>
                              </p>
                          </div>
                      </div>
                      <!-- Fifth Member -->
                      <div class="desc">
                          <div class="thumb">
                          </div>
                          <div class="details">
                              <p><a href="#">Draxxin® (tuluthramycin)</a><br/>
                                 <muted>Cost to treat a 500-pound calf - $18.15</muted>
                              </p>
                          </div>
                      </div>

                        <!-- CALENDAR-->
                        <div id="calendar" class="mb">
                            <div class="panel green-panel no-margin">
                                <div class="panel-body">
                                    <div id="date-popover" class="popover top" style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
                                        <div class="arrow"></div>
                                        <h3 class="popover-title" style="disadding: none;"></h3>
                                        <div id="date-popover-content" class="popover-content"></div>
                                    </div>
                                    <div id="my-calendar"></div>
                                </div>
                            </div>
                        </div><!-- / calendar -->
                      
                  </div><!-- /col-lg-3 -->
              </div>
          </section>
      </section>

        <!--main content end-->
        <!--footer start-->

"""),_display_(/*278.2*/footer()),format.raw/*278.10*/("""

        """),format.raw/*280.9*/("""<!--footer end-->
    </section>

    <script type="application/javascript">
        $(document).ready(function () """),format.raw/*284.39*/("""{"""),format.raw/*284.40*/("""
            """),format.raw/*285.13*/("""//$("#date-popover").popover("""),format.raw/*285.42*/("""{"""),format.raw/*285.43*/("""html: true, trigger: "manual""""),format.raw/*285.72*/("""}"""),format.raw/*285.73*/(""");
            $("#date-popover").hide();
            $("#date-popover").click(function (e) """),format.raw/*287.51*/("""{"""),format.raw/*287.52*/("""
                """),format.raw/*288.17*/("""$(this).hide();
            """),format.raw/*289.13*/("""}"""),format.raw/*289.14*/(""");
        
            $("#my-calendar").zabuto_calendar("""),format.raw/*291.47*/("""{"""),format.raw/*291.48*/("""
                """),format.raw/*292.17*/("""action: function () """),format.raw/*292.37*/("""{"""),format.raw/*292.38*/("""
                    """),format.raw/*293.21*/("""return myDateFunction(this.id, false);
                """),format.raw/*294.17*/("""}"""),format.raw/*294.18*/(""",
                action_nav: function () """),format.raw/*295.41*/("""{"""),format.raw/*295.42*/("""
                    """),format.raw/*296.21*/("""return myNavFunction(this.id);
                """),format.raw/*297.17*/("""}"""),format.raw/*297.18*/(""",
                ajax: """),format.raw/*298.23*/("""{"""),format.raw/*298.24*/("""
                    """),format.raw/*299.21*/("""url: "show_data.php?action=1",
                    modal: true
                """),format.raw/*301.17*/("""}"""),format.raw/*301.18*/(""",
                legend: [
                    """),format.raw/*303.21*/("""{"""),format.raw/*303.22*/("""type: "text", label: "Special event", badge: "00""""),format.raw/*303.71*/("""}"""),format.raw/*303.72*/(""",
                    """),format.raw/*304.21*/("""{"""),format.raw/*304.22*/("""type: "block", label: "Regular event", """),format.raw/*304.61*/("""}"""),format.raw/*304.62*/("""
                """),format.raw/*305.17*/("""]
            """),format.raw/*306.13*/("""}"""),format.raw/*306.14*/(""");
        """),format.raw/*307.9*/("""}"""),format.raw/*307.10*/(""");
        
        
        function myNavFunction(id) """),format.raw/*310.36*/("""{"""),format.raw/*310.37*/("""
            """),format.raw/*311.13*/("""$("#date-popover").hide();
            var nav = $("#" + id).data("navigation");
            var to = $("#" + id).data("to");
            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
        """),format.raw/*315.9*/("""}"""),format.raw/*315.10*/("""
    """),format.raw/*316.5*/("""</script>

    <script>

        var x = """),_display_(/*320.18*/Html(myjsonResult)),format.raw/*320.36*/(""";
        
        for(var i = 0; i < x.length; i++) """),format.raw/*322.43*/("""{"""),format.raw/*322.44*/("""
              """),format.raw/*323.15*/("""var y = x[i];
              for(var k in y) """),format.raw/*324.31*/("""{"""),format.raw/*324.32*/("""
                  """),format.raw/*325.19*/("""if(k == "temperature") """),format.raw/*325.42*/("""{"""),format.raw/*325.43*/("""
                      """),format.raw/*326.23*/("""y[k] = parseInt(y[k]);
                  """),format.raw/*327.19*/("""}"""),format.raw/*327.20*/("""
              """),format.raw/*328.15*/("""}"""),format.raw/*328.16*/("""
        """),format.raw/*329.9*/("""}"""),format.raw/*329.10*/("""
        """),format.raw/*330.9*/("""//var mapValues=["""),format.raw/*330.26*/("""{"""),format.raw/*330.27*/("""cow: 'cow1', temperature: 30"""),format.raw/*330.55*/("""}"""),format.raw/*330.56*/(""","""),format.raw/*330.57*/("""{"""),format.raw/*330.58*/("""cow: 'cow2', temperature: 32"""),format.raw/*330.86*/("""}"""),format.raw/*330.87*/(""","""),format.raw/*330.88*/("""{"""),format.raw/*330.89*/("""cow: 'cow3', temperature: 38"""),format.raw/*330.117*/("""}"""),format.raw/*330.118*/(""","""),format.raw/*330.119*/("""{"""),format.raw/*330.120*/("""cow: 'cow4', temperature: 40"""),format.raw/*330.148*/("""}"""),format.raw/*330.149*/(""","""),format.raw/*330.150*/("""{"""),format.raw/*330.151*/("""cow: 'cow5', temperature: 42"""),format.raw/*330.179*/("""}"""),format.raw/*330.180*/(""","""),format.raw/*330.181*/("""{"""),format.raw/*330.182*/("""cow: 'cow6', temperature: 34"""),format.raw/*330.210*/("""}"""),format.raw/*330.211*/("""];
        
        Morris.Bar("""),format.raw/*332.20*/("""{"""),format.raw/*332.21*/("""
            """),format.raw/*333.13*/("""element: 'bar-example',
            data: x,
            xkey: 'cow',
            ykeys: ['temperature'],
            labels: ['temperature'],
            barRatio: 0.4,
            xLabelAngle: 35,
            hideHover: 'auto',
            barColors: ['#FF865C',]
            """),format.raw/*342.13*/("""}"""),format.raw/*342.14*/(""");

    </script> 

""")))}),format.raw/*346.2*/("""
"""))}
  }

  def render(message:String,noOfCowsInCattle:String,statusOk:String,noOfSickCows:String,jsonResult:String,heatIndex:String,myjsonResult:String,notify:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,noOfCowsInCattle,statusOk,noOfSickCows,jsonResult,heatIndex,myjsonResult,notify)

  def f:((String,String,String,String,String,String,String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,noOfCowsInCattle,statusOk,noOfSickCows,jsonResult,heatIndex,myjsonResult,notify) => apply(message,noOfCowsInCattle,statusOk,noOfSickCows,jsonResult,heatIndex,myjsonResult,notify)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:16:24 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/dashboard.scala.html
                  HASH: 42d2334697ecbc1eab426c4a7c8f791a5401c10a
                  MATRIX: 782->1|1040->170|1068->173|1107->204|1146->206|1178->212|1230->239|1266->255|1294->257|1712->648|1727->654|1785->691|1962->841|1999->857|3213->2044|3228->2050|3280->2081|3456->2230|3489->2242|3706->2432|3741->2458|3780->2459|3835->2486|4001->2625|4016->2631|4070->2664|4315->2882|4344->2890|4550->3077|4563->3081|4602->3082|4657->3109|4823->3248|4838->3254|4896->3291|5108->3476|5137->3484|5361->3677|5435->3723|6180->4440|6209->4441|6286->4490|6433->4609|6462->4610|6536->4656|6565->4657|6642->4706|6792->4828|6821->4829|6890->4870|7658->5610|7674->5616|7728->5648|8420->6312|8451->6321|8515->6356|8732->6545|8764->6555|8982->6744|9012->6745|9086->6790|9235->6910|9265->6911|9347->6964|9613->7201|9643->7202|9717->7247|9789->7290|9819->7291|11165->8608|11198->8618|12720->10112|12748->10130|12788->10131|12860->10175|12904->10202|12945->10204|12999->10229|13427->10629|13461->10641|13623->10771|13679->10795|13730->10817|17959->15019|17989->15027|18027->15037|18171->15152|18201->15153|18243->15166|18301->15195|18331->15196|18389->15225|18419->15226|18540->15318|18570->15319|18616->15336|18673->15364|18703->15365|18790->15423|18820->15424|18866->15441|18915->15461|18945->15462|18995->15483|19079->15538|19109->15539|19180->15581|19210->15582|19260->15603|19336->15650|19366->15651|19419->15675|19449->15676|19499->15697|19607->15776|19637->15777|19714->15825|19744->15826|19822->15875|19852->15876|19903->15898|19933->15899|20001->15938|20031->15939|20077->15956|20120->15970|20150->15971|20189->15982|20219->15983|20304->16039|20334->16040|20376->16053|20614->16263|20644->16264|20677->16269|20747->16311|20787->16329|20869->16382|20899->16383|20943->16398|21016->16442|21046->16443|21094->16462|21146->16485|21176->16486|21228->16509|21298->16550|21328->16551|21372->16566|21402->16567|21439->16576|21469->16577|21506->16586|21552->16603|21582->16604|21639->16632|21669->16633|21699->16634|21729->16635|21786->16663|21816->16664|21846->16665|21876->16666|21934->16694|21965->16695|21996->16696|22027->16697|22085->16725|22116->16726|22147->16727|22178->16728|22236->16756|22267->16757|22298->16758|22329->16759|22387->16787|22418->16788|22478->16819|22508->16820|22550->16833|22857->17111|22887->17112|22939->17133
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|37->9|46->18|46->18|46->18|48->20|48->20|69->41|69->41|69->41|71->43|71->43|75->47|75->47|75->47|76->48|78->50|78->50|78->50|80->52|80->52|84->56|84->56|84->56|85->57|87->59|87->59|87->59|89->61|89->61|93->65|95->67|108->80|108->80|109->81|111->83|111->83|112->84|112->84|113->85|115->87|115->87|116->88|128->100|128->100|128->100|140->112|140->112|141->113|144->116|144->116|147->119|147->119|148->120|150->122|150->122|151->123|154->126|154->126|155->127|157->129|157->129|173->145|173->145|203->175|203->175|203->175|204->176|204->176|204->176|206->178|213->185|213->185|217->189|218->190|219->191|306->278|306->278|308->280|312->284|312->284|313->285|313->285|313->285|313->285|313->285|315->287|315->287|316->288|317->289|317->289|319->291|319->291|320->292|320->292|320->292|321->293|322->294|322->294|323->295|323->295|324->296|325->297|325->297|326->298|326->298|327->299|329->301|329->301|331->303|331->303|331->303|331->303|332->304|332->304|332->304|332->304|333->305|334->306|334->306|335->307|335->307|338->310|338->310|339->311|343->315|343->315|344->316|348->320|348->320|350->322|350->322|351->323|352->324|352->324|353->325|353->325|353->325|354->326|355->327|355->327|356->328|356->328|357->329|357->329|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|358->330|360->332|360->332|361->333|370->342|370->342|374->346
                  -- GENERATED --
              */
          