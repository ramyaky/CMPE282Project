
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
                          <div class="col-md-2 col-sm-2 col-md-offset-1 box0">
                              <div class="box1">
                              <img alt="Relax" src=""""),_display_(/*18.54*/routes/*18.60*/.Assets.at("images/cutie_burned.png")),format.raw/*18.97*/("""" style="width:100px;height:120px;">
                                  <!-- <span class="li_heart"></span> -->
                                  <h3>"""),_display_(/*20.40*/noOfCowsInCattle),format.raw/*20.56*/("""</h3>
                              </div>
                                  <p>Number of cows in cattle center as of today</p>
                          </div>
                          <div class="col-md-3 col-sm-3 box0">
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
                                <img alt="Relax" src=""""),_display_(/*77.56*/routes/*77.62*/.Assets.at("images/THIndex.png")),format.raw/*77.94*/("""" style="width:300px;height:300px;">
                              </div>
                        </div><!-- /col-md-4 -->
                        
                        
                        <div class="col-md-4 mb">
                            <!-- INSTAGRAM PANEL -->
                            <div class="darkblue-panel pn" style="height:400px;">
                                <div class="darkblue-header">
                                      <h5>Recent Heat Index</h5>
                                  </div>
                                  <div style="font-size: xx-large;color: #FF865C;padding-top: 100px;">
                                  """),_display_(/*89.36*/heatIndex),format.raw/*89.45*/("""
                                  """),format.raw/*90.35*/("""</div>
                                <button type="button" class="btn btn-theme" onclick="JSONTest();"><i class="fa fa-check"></i> Update Linear Regression</button>
                                <!-- <canvas id="bar1" height="300" width="300"></canvas>
                                <script>
                                var chartvalues = """),_display_(/*94.52*/jsonResult),format.raw/*94.62*/(""";
                                var arr = chartvalues;
                                var labl = ["Slot1","Slot2","Slot3","Slot4"]
                                    var barChartData = """),format.raw/*97.56*/("""{"""),format.raw/*97.57*/("""
                                            """),format.raw/*98.45*/("""labels : labl,
                                            datasets : [
                                                """),format.raw/*100.49*/("""{"""),format.raw/*100.50*/("""
                                                    """),format.raw/*101.53*/("""fillColor : "rgba(220,220,220,0.5)",
                                                    strokeColor : "rgba(220,220,220,1)",
                                                    data : arr
                                                """),format.raw/*104.49*/("""}"""),format.raw/*104.50*/("""
                                            """),format.raw/*105.45*/("""]

                                        """),format.raw/*107.41*/("""}"""),format.raw/*107.42*/(""";
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
                                    <div class="sparkline" data-type="line" data-resize="true" data-height="75" data-width="90%" data-line-width="1" data-line-color="#fff" data-spot-color="#fff" data-fill-color="" data-highlight-line-color="#fff" data-spot-radius="4" data-data=""""),_display_(/*123.281*/jsonResult),format.raw/*123.291*/("""">></div>
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
                                      """),_display_(/*153.40*/if(notify != null)/*153.58*/{_display_(Seq[Any](format.raw/*153.59*/("""  
                                        """),_display_(/*154.42*/for(singleNotify <- notify) yield /*154.69*/ {_display_(Seq[Any](format.raw/*154.71*/("""
 
                      """),format.raw/*156.23*/("""<!-- First Action -->
                      <div class="desc">
                          <div class="thumb">
                              <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                          </div>
                          <div class="details">
                                 <a href="#" style="color: #666;">"""),_display_(/*162.68*/singleNotify),format.raw/*162.80*/("""</a><br/>
                          </div>
                      </div>
                      """)))}),format.raw/*165.24*/("""
                      """)))}),format.raw/*166.24*/("""
                     """),format.raw/*167.22*/("""<!--  <!-- Second Action 
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

"""),_display_(/*254.2*/footer()),format.raw/*254.10*/("""

        """),format.raw/*256.9*/("""<!--footer end-->
    </section>

        <script type="text/javascript">  
        
         var JSONTest = function() """),format.raw/*261.36*/("""{"""),format.raw/*261.37*/("""
           """),format.raw/*262.12*/("""// var reqNum = document.getElementById('location').value; 
          /*  var arr =  $("input[name='check']:checked").map(function()"""),format.raw/*263.73*/("""{"""),format.raw/*263.74*/("""
                    """),format.raw/*264.21*/("""return this.value;
                   """),format.raw/*265.20*/("""}"""),format.raw/*265.21*/(""").get()*/
          //  var data = JSON.stringify(arr);
            //var url = "http://localhost:9000/compute/AmazonS3/SingleRequests/"+reqNum;
            var url = "http://localhost:9000/predictiveanalysis";
             
            $.ajax("""),format.raw/*270.20*/("""{"""),format.raw/*270.21*/("""
                """),format.raw/*271.17*/("""url: url,
                type: 'POST',
                async: false,
                success: function (result) """),format.raw/*274.44*/("""{"""),format.raw/*274.45*/("""
                    """),format.raw/*275.21*/("""alert("Successfully uploaded files. Please check dashboard");
                    //alert("In success");
                    //switch (result) """),format.raw/*277.39*/("""{"""),format.raw/*277.40*/("""
                        """),format.raw/*278.25*/("""//case true:
                            //processResponse(result);
                          //break;
                    //default:
                      //    resultDiv.html(result);
                    //"""),format.raw/*283.23*/("""}"""),format.raw/*283.24*/("""
                """),format.raw/*284.17*/("""}"""),format.raw/*284.18*/(""",
                error: function (xhr, ajaxOptions, thrownError) """),format.raw/*285.65*/("""{"""),format.raw/*285.66*/("""
                    """),format.raw/*286.21*/("""alert("Successfully uploaded files. Please check dashboard");
                    //alert(xhr.status);
                    //alert(thrownError);
                """),format.raw/*289.17*/("""}"""),format.raw/*289.18*/("""
           """),format.raw/*290.12*/("""}"""),format.raw/*290.13*/(""");
          """),format.raw/*291.11*/("""}"""),format.raw/*291.12*/("""


        """),format.raw/*294.9*/("""</script>


    <script type="application/javascript">
        $(document).ready(function () """),format.raw/*298.39*/("""{"""),format.raw/*298.40*/("""
            """),format.raw/*299.13*/("""//$("#date-popover").popover("""),format.raw/*299.42*/("""{"""),format.raw/*299.43*/("""html: true, trigger: "manual""""),format.raw/*299.72*/("""}"""),format.raw/*299.73*/(""");
            $("#date-popover").hide();
            $("#date-popover").click(function (e) """),format.raw/*301.51*/("""{"""),format.raw/*301.52*/("""
                """),format.raw/*302.17*/("""$(this).hide();
            """),format.raw/*303.13*/("""}"""),format.raw/*303.14*/(""");
        
            $("#my-calendar").zabuto_calendar("""),format.raw/*305.47*/("""{"""),format.raw/*305.48*/("""
                """),format.raw/*306.17*/("""action: function () """),format.raw/*306.37*/("""{"""),format.raw/*306.38*/("""
                    """),format.raw/*307.21*/("""return myDateFunction(this.id, false);
                """),format.raw/*308.17*/("""}"""),format.raw/*308.18*/(""",
                action_nav: function () """),format.raw/*309.41*/("""{"""),format.raw/*309.42*/("""
                    """),format.raw/*310.21*/("""return myNavFunction(this.id);
                """),format.raw/*311.17*/("""}"""),format.raw/*311.18*/(""",
                ajax: """),format.raw/*312.23*/("""{"""),format.raw/*312.24*/("""
                    """),format.raw/*313.21*/("""url: "show_data.php?action=1",
                    modal: true
                """),format.raw/*315.17*/("""}"""),format.raw/*315.18*/(""",
                legend: [
                    """),format.raw/*317.21*/("""{"""),format.raw/*317.22*/("""type: "text", label: "Special event", badge: "00""""),format.raw/*317.71*/("""}"""),format.raw/*317.72*/(""",
                    """),format.raw/*318.21*/("""{"""),format.raw/*318.22*/("""type: "block", label: "Regular event", """),format.raw/*318.61*/("""}"""),format.raw/*318.62*/("""
                """),format.raw/*319.17*/("""]
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""");
        """),format.raw/*321.9*/("""}"""),format.raw/*321.10*/(""");
        
        
        function myNavFunction(id) """),format.raw/*324.36*/("""{"""),format.raw/*324.37*/("""
            """),format.raw/*325.13*/("""$("#date-popover").hide();
            var nav = $("#" + id).data("navigation");
            var to = $("#" + id).data("to");
            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
        """),format.raw/*329.9*/("""}"""),format.raw/*329.10*/("""
    """),format.raw/*330.5*/("""</script>

    <script>

        var x = """),_display_(/*334.18*/Html(myjsonResult)),format.raw/*334.36*/(""";
        
        for(var i = 0; i < x.length; i++) """),format.raw/*336.43*/("""{"""),format.raw/*336.44*/("""
              """),format.raw/*337.15*/("""var y = x[i];
              for(var k in y) """),format.raw/*338.31*/("""{"""),format.raw/*338.32*/("""
                  """),format.raw/*339.19*/("""if(k == "temperature") """),format.raw/*339.42*/("""{"""),format.raw/*339.43*/("""
                      """),format.raw/*340.23*/("""y[k] = parseInt(y[k]);
                  """),format.raw/*341.19*/("""}"""),format.raw/*341.20*/("""
              """),format.raw/*342.15*/("""}"""),format.raw/*342.16*/("""
        """),format.raw/*343.9*/("""}"""),format.raw/*343.10*/("""
        """),format.raw/*344.9*/("""//var mapValues=["""),format.raw/*344.26*/("""{"""),format.raw/*344.27*/("""cow: 'cow1', temperature: 30"""),format.raw/*344.55*/("""}"""),format.raw/*344.56*/(""","""),format.raw/*344.57*/("""{"""),format.raw/*344.58*/("""cow: 'cow2', temperature: 32"""),format.raw/*344.86*/("""}"""),format.raw/*344.87*/(""","""),format.raw/*344.88*/("""{"""),format.raw/*344.89*/("""cow: 'cow3', temperature: 38"""),format.raw/*344.117*/("""}"""),format.raw/*344.118*/(""","""),format.raw/*344.119*/("""{"""),format.raw/*344.120*/("""cow: 'cow4', temperature: 40"""),format.raw/*344.148*/("""}"""),format.raw/*344.149*/(""","""),format.raw/*344.150*/("""{"""),format.raw/*344.151*/("""cow: 'cow5', temperature: 42"""),format.raw/*344.179*/("""}"""),format.raw/*344.180*/(""","""),format.raw/*344.181*/("""{"""),format.raw/*344.182*/("""cow: 'cow6', temperature: 34"""),format.raw/*344.210*/("""}"""),format.raw/*344.211*/("""];
        
        Morris.Bar("""),format.raw/*346.20*/("""{"""),format.raw/*346.21*/("""
            """),format.raw/*347.13*/("""element: 'bar-example',
            data: x,
            xkey: 'cow',
            ykeys: ['temperature'],
            labels: ['temperature'],
            barRatio: 0.4,
            xLabelAngle: 35,
            hideHover: 'auto',
            barColors: ['#FF865C',]
            """),format.raw/*356.13*/("""}"""),format.raw/*356.14*/(""");

    </script> 

""")))}),format.raw/*360.2*/("""
"""))}
  }

  def render(message:String,noOfCowsInCattle:String,statusOk:String,noOfSickCows:String,jsonResult:String,heatIndex:String,myjsonResult:String,notify:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,noOfCowsInCattle,statusOk,noOfSickCows,jsonResult,heatIndex,myjsonResult,notify)

  def f:((String,String,String,String,String,String,String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,noOfCowsInCattle,statusOk,noOfSickCows,jsonResult,heatIndex,myjsonResult,notify) => apply(message,noOfCowsInCattle,statusOk,noOfSickCows,jsonResult,heatIndex,myjsonResult,notify)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 22:49:32 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/dashboard.scala.html
                  HASH: 16c8353946e624d0a5351bbf7c8c0751c0c39671
                  MATRIX: 782->1|1040->170|1068->173|1107->204|1146->206|1178->212|1230->239|1266->255|1294->257|1712->648|1727->654|1785->691|1962->841|1999->857|3213->2044|3228->2050|3280->2081|3456->2230|3489->2242|3706->2432|3741->2458|3780->2459|3835->2486|4001->2625|4016->2631|4070->2664|4315->2882|4344->2890|4550->3077|4563->3081|4602->3082|4657->3109|4823->3248|4838->3254|4896->3291|5108->3476|5137->3484|5361->3677|5435->3723|5992->4253|6007->4259|6060->4291|6751->4955|6781->4964|6844->4999|7220->5348|7251->5358|7468->5547|7497->5548|7570->5593|7719->5713|7749->5714|7831->5767|8097->6004|8127->6005|8201->6050|8273->6093|8303->6094|9649->7411|9682->7421|11204->8915|11232->8933|11272->8934|11344->8978|11388->9005|11429->9007|11483->9032|11864->9385|11898->9397|12025->9492|12081->9516|12132->9538|16361->13740|16391->13748|16429->13758|16578->13878|16608->13879|16649->13891|16810->14023|16840->14024|16890->14045|16957->14083|16987->14084|17260->14328|17290->14329|17336->14346|17478->14459|17508->14460|17558->14481|17730->14624|17760->14625|17814->14650|18051->14858|18081->14859|18127->14876|18157->14877|18252->14943|18282->14944|18332->14965|18522->15126|18552->15127|18593->15139|18623->15140|18665->15153|18695->15154|18734->15165|18856->15258|18886->15259|18928->15272|18986->15301|19016->15302|19074->15331|19104->15332|19225->15424|19255->15425|19301->15442|19358->15470|19388->15471|19475->15529|19505->15530|19551->15547|19600->15567|19630->15568|19680->15589|19764->15644|19794->15645|19865->15687|19895->15688|19945->15709|20021->15756|20051->15757|20104->15781|20134->15782|20184->15803|20292->15882|20322->15883|20399->15931|20429->15932|20507->15981|20537->15982|20588->16004|20618->16005|20686->16044|20716->16045|20762->16062|20805->16076|20835->16077|20874->16088|20904->16089|20989->16145|21019->16146|21061->16159|21299->16369|21329->16370|21362->16375|21432->16417|21472->16435|21554->16488|21584->16489|21628->16504|21701->16548|21731->16549|21779->16568|21831->16591|21861->16592|21913->16615|21983->16656|22013->16657|22057->16672|22087->16673|22124->16682|22154->16683|22191->16692|22237->16709|22267->16710|22324->16738|22354->16739|22384->16740|22414->16741|22471->16769|22501->16770|22531->16771|22561->16772|22619->16800|22650->16801|22681->16802|22712->16803|22770->16831|22801->16832|22832->16833|22863->16834|22921->16862|22952->16863|22983->16864|23014->16865|23072->16893|23103->16894|23163->16925|23193->16926|23235->16939|23542->17217|23572->17218|23624->17239
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|37->9|46->18|46->18|46->18|48->20|48->20|69->41|69->41|69->41|71->43|71->43|75->47|75->47|75->47|76->48|78->50|78->50|78->50|80->52|80->52|84->56|84->56|84->56|85->57|87->59|87->59|87->59|89->61|89->61|93->65|95->67|105->77|105->77|105->77|117->89|117->89|118->90|122->94|122->94|125->97|125->97|126->98|128->100|128->100|129->101|132->104|132->104|133->105|135->107|135->107|151->123|151->123|181->153|181->153|181->153|182->154|182->154|182->154|184->156|190->162|190->162|193->165|194->166|195->167|282->254|282->254|284->256|289->261|289->261|290->262|291->263|291->263|292->264|293->265|293->265|298->270|298->270|299->271|302->274|302->274|303->275|305->277|305->277|306->278|311->283|311->283|312->284|312->284|313->285|313->285|314->286|317->289|317->289|318->290|318->290|319->291|319->291|322->294|326->298|326->298|327->299|327->299|327->299|327->299|327->299|329->301|329->301|330->302|331->303|331->303|333->305|333->305|334->306|334->306|334->306|335->307|336->308|336->308|337->309|337->309|338->310|339->311|339->311|340->312|340->312|341->313|343->315|343->315|345->317|345->317|345->317|345->317|346->318|346->318|346->318|346->318|347->319|348->320|348->320|349->321|349->321|352->324|352->324|353->325|357->329|357->329|358->330|362->334|362->334|364->336|364->336|365->337|366->338|366->338|367->339|367->339|367->339|368->340|369->341|369->341|370->342|370->342|371->343|371->343|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|372->344|374->346|374->346|375->347|384->356|384->356|388->360
                  -- GENERATED --
              */
          