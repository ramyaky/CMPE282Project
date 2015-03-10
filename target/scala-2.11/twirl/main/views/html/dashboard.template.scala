
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Cattle Center Dashboard")/*1.33*/ {_display_(Seq[Any](format.raw/*1.35*/("""

    """),format.raw/*3.5*/("""<section id="container">

"""),_display_(/*5.2*/commonTemplate()),format.raw/*5.18*/("""

        """),format.raw/*7.9*/("""<section id="main-content">
            <section class="wrapper">

                <div class="row">
                    <div class="col-lg-9 main-chart">

                        <div class="row mtbox">
                            <div class="col-md-3 col-sm-2 col-md-offset-1 box0">
                                <div class="box1">
                                    <img alt="Relax" src=""""),_display_(/*16.60*/routes/*16.66*/.Assets.at("images/presentCow_burned.png")),format.raw/*16.108*/(""""
                                        style="width: 100px; height: 120px;">
                                    <!-- <span class="li_heart"></span> -->
                                    <h3>33</h3>
                                </div>
                                <p>Number of cows in catle center as of today</p>
                            </div>
                            <div class="col-md-2 col-sm-2 box0">
                                <div class="box1">
                                    <img alt="Relax" src=""""),_display_(/*25.60*/routes/*25.66*/.Assets.at("images/crying.png")),format.raw/*25.97*/(""""
                                        style="width: 100px; height: 120px;">
                                    <!-- <span class="li_cloud"></span> -->
                                    <h3 id="weathervalue"></h3>
                                </div>
                                <p>Number of cows infected with BRD</p>
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
                                    <img alt="Relax" src=""""),_display_(/*41.60*/routes/*41.66*/.Assets.at("images/sadCow.png")),format.raw/*41.97*/(""""
                                        style="width: 100px; height: 120px;">
                                    <!-- <span class="li_news"></span> -->
                                    <h3>+10</h3>
                                </div>
                                <p>Some cows are experiencing abnormal body temperatures!</p>
                            </div>
                            <div class="col-md-3 col-sm-2 box0">
                                <div class="box1">
                                    <img alt="Relax" src=""""),_display_(/*50.60*/routes/*50.66*/.Assets.at("images/Relax_burned.png")),format.raw/*50.103*/(""""
                                        style="width: 100px; height: 120px;">
                                    <!-- <span style="background-image: url(assets/img/Relax.jpg)"></span> -->
                                    <h3>OK!</h3>
                                </div>
                                <p>Your Cattle is working perfectly. Relax & enjoy.</p>
                            </div>

                        </div>
                        <!-- /row mt -->


                        <div class="row">
                            <!-- TWITTER PANEL -->
                            <div class="col-md-4 mb">
                                <div class="darkblue-panel pn">
                                    <div class="darkblue-header">
                                        <h5>DROPBOX STATICS</h5>
                                    </div>
                                    <canvas id="serverstatus02" height="120" width="120"></canvas>
                                    <script>
                                    var doughnutData = [
                                            """),format.raw/*72.45*/("""{"""),format.raw/*72.46*/("""
                                                """),format.raw/*73.49*/("""value: 60,
                                                color:"#68dff0"
                                            """),format.raw/*75.45*/("""}"""),format.raw/*75.46*/(""",
                                            """),format.raw/*76.45*/("""{"""),format.raw/*76.46*/("""
                                                """),format.raw/*77.49*/("""value : 40,
                                                color : "#444c57"
                                            """),format.raw/*79.45*/("""}"""),format.raw/*79.46*/("""
                                        """),format.raw/*80.41*/("""];
                                        var myDoughnut = new Chart(document.getElementById("serverstatus02").getContext("2d")).Doughnut(doughnutData);
                                </script>
                                    <p>April 17, 2014</p>
                                    <footer>
                                        <div class="pull-left">
                                            <h5>
                                                <i class="fa fa-hdd-o"></i> 17 GB
                                            </h5>
                                        </div>
                                        <div class="pull-right">
                                            <h5>60% Used</h5>
                                        </div>
                                    </footer>
                                </div>
                                <! -- /darkblue panel -->
                            </div>
                            <!-- /col-md-4 -->


                            <div class="col-md-4 mb">
                                <!-- INSTAGRAM PANEL -->
                                <div class="darkblue-panel pn">
                                    <div class="darkblue-header">
                                        <h5>Today's Temperature Index</h5>
                                    </div>
                                    <canvas id="bar1" height="180" width="400"></canvas>
                                    <div id="buckets-size-bar-chart"> </div>
                                </div>
                            </div>
                            <!-- /col-md-4 -->

                            <div class="col-md-4 col-sm-4 mb">
                                <!-- REVENUE PANEL -->
                                <div class="darkblue-panel pn">
                                    <div class="darkblue-header">
                                        <h5>REVENUE</h5>
                                    </div>
                                    <div class="chart mt">
                                        <div class="sparkline" data-type="line" data-resize="true"
                                            data-height="75" data-width="90%" data-line-width="1"
                                            data-line-color="#fff" data-spot-color="#fff"
                                            data-fill-color="" data-highlight-line-color="#fff"
                                            data-spot-radius="4"
                                            data-data="[200,135,667,333,526,996,564,123,890,464,655]"></div>
                                    </div>
                                    <p class="mt">
                                        <b>$ 17,980</b><br />Month Income
                                    </p>
                                </div>
                            </div>
                            <!-- /col-md-4 -->

                        </div>
                        <!-- /row -->

                        <div class="row mt">
                            <!--CUSTOM CHART START -->
                            <div class="border-head">
                                <h3>VISITS</h3>
                            </div>
                            <div class="custom-bar-chart">
                                <ul class="y-axis">
                                    <li><span>10.000</span></li>
                                    <li><span>8.000</span></li>
                                    <li><span>6.000</span></li>
                                    <li><span>4.000</span></li>
                                    <li><span>2.000</span></li>
                                    <li><span>0</span></li>
                                </ul>
                                <div class="bar">
                                    <div class="title">JAN</div>
                                    <div class="value tooltips" data-original-title="8.500"
                                        data-toggle="tooltip" data-placement="top">85%</div>
                                </div>
                                <div class="bar ">
                                    <div class="title">FEB</div>
                                    <div class="value tooltips" data-original-title="5.000"
                                        data-toggle="tooltip" data-placement="top">50%</div>
                                </div>
                                <div class="bar ">
                                    <div class="title">MAR</div>
                                    <div class="value tooltips" data-original-title="6.000"
                                        data-toggle="tooltip" data-placement="top">60%</div>
                                </div>
                                <div class="bar ">
                                    <div class="title">APR</div>
                                    <div class="value tooltips" data-original-title="4.500"
                                        data-toggle="tooltip" data-placement="top">45%</div>
                                </div>
                                <div class="bar">
                                    <div class="title">MAY</div>
                                    <div class="value tooltips" data-original-title="3.200"
                                        data-toggle="tooltip" data-placement="top">32%</div>
                                </div>
                                <div class="bar ">
                                    <div class="title">JUN</div>
                                    <div class="value tooltips" data-original-title="6.200"
                                        data-toggle="tooltip" data-placement="top">62%</div>
                                </div>
                                <div class="bar">
                                    <div class="title">JUL</div>
                                    <div class="value tooltips" data-original-title="7.500"
                                        data-toggle="tooltip" data-placement="top">75%</div>
                                </div>
                            </div>
                            <!--custom chart end-->
                        </div>
                        <!-- /row -->

                    </div>
                    <!-- /col-lg-9 END SECTION MIDDLE -->


                    <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->

                    <div class="col-lg-3 ds">
                        <!--COMPLETED ACTIONS DONUTS CHART-->
                        <h3>Notifications</h3>

                        <!-- First Action -->
                        <div class="desc">
                            <div class="thumb">
                                <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                            </div>
                            <div class="details">
                                <p>
                                    <muted>2 Minutes Ago</muted>
                                    <br /> <a href="#">Cow1</a> experienced sudden rise in its body
                                    temperature<br />
                                </p>
                            </div>
                        </div>
                        <!-- Second Action -->
                        <div class="desc">
                            <div class="thumb">
                                <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                            </div>
                            <div class="details">
                                <p>
                                    <muted>3 Hours Ago</muted>
                                    <br /> <a href="#">Cow 3</a> experienced sudden rise in its
                                    body temperature<br />
                                </p>
                            </div>
                        </div>

                        <!-- USERS ONLINE SECTION -->
                        <h3>Treatments offered for BRD in Metaphylaxis</h3>
                        <!-- First Member -->
                        <div class="desc">
                            <div class="thumb"></div>
                            <div class="details">
                                <p>
                                    <a href="#">Micotil® (tilmicosin)</a><br />
                                    <muted>Cost to treat a 500-pound calf - $8.00</muted>
                                </p>
                            </div>
                        </div>
                        <!-- Second Member -->
                        <div class="desc">
                            <div class="thumb"></div>
                            <div class="details">
                                <p>
                                    <a href="#">Nuflor® (florphenicol)</a><br />
                                    <muted>Cost to treat a 500-pound calf - $15.00</muted>
                                </p>
                            </div>
                        </div>
                        <!-- Third Member -->
                        <div class="desc">
                            <div class="thumb"></div>
                            <div class="details">
                                <p>
                                    <a href="#">Tetradure® (oxytetracycline 300 mg/ml)</a><br />
                                    <muted>Cost to treat a 500-pound calf - ($4.05 - $6.02)</muted>
                                </p>
                            </div>
                        </div>
                        <!-- Fourth Member -->
                        <div class="desc">
                            <div class="thumb"></div>
                            <div class="details">
                                <p>
                                    <a href="#">Excede® (ceftiofur 200mg/ml)</a><br />
                                    <muted>Cost to treat a 500-pound calf - $13.12</muted>
                                </p>
                            </div>
                        </div>
                        <!-- Fifth Member -->
                        <div class="desc">
                            <div class="thumb"></div>
                            <div class="details">
                                <p>
                                    <a href="#">Draxxin® (tuluthramycin)</a><br />
                                    <muted>Cost to treat a 500-pound calf - $18.15</muted>
                                </p>
                            </div>
                        </div>

                        <!-- CALENDAR-->
                        <div id="calendar" class="mb">
                            <div class="panel green-panel no-margin">
                                <div class="panel-body">
                                    <div id="date-popover" class="popover top"
                                        style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
                                        <div class="arrow"></div>
                                        <h3 class="popover-title" style="disadding: none;"></h3>
                                        <div id="date-popover-content" class="popover-content"></div>
                                    </div>
                                    <div id="my-calendar"></div>
                                </div>
                            </div>
                        </div>
                        <!-- / calendar -->

                    </div>
                    <!-- /col-lg-3 -->
                </div>
            </section>
        </section>

        <!--main content end-->

"""),_display_(/*306.2*/footer()),format.raw/*306.10*/("""

    """),format.raw/*308.5*/("""</section>

    <script type="application/javascript">
        $(document).ready(function () """),format.raw/*311.39*/("""{"""),format.raw/*311.40*/("""
            """),format.raw/*312.13*/("""//$("#date-popover").popover("""),format.raw/*312.42*/("""{"""),format.raw/*312.43*/("""html: true, trigger: "manual""""),format.raw/*312.72*/("""}"""),format.raw/*312.73*/(""");
            $("#date-popover").hide();
            $("#date-popover").click(function (e) """),format.raw/*314.51*/("""{"""),format.raw/*314.52*/("""
                """),format.raw/*315.17*/("""$(this).hide();
            """),format.raw/*316.13*/("""}"""),format.raw/*316.14*/(""");
        
            $("#my-calendar").zabuto_calendar("""),format.raw/*318.47*/("""{"""),format.raw/*318.48*/("""
                """),format.raw/*319.17*/("""action: function () """),format.raw/*319.37*/("""{"""),format.raw/*319.38*/("""
                    """),format.raw/*320.21*/("""return myDateFunction(this.id, false);
                """),format.raw/*321.17*/("""}"""),format.raw/*321.18*/(""",
                action_nav: function () """),format.raw/*322.41*/("""{"""),format.raw/*322.42*/("""
                    """),format.raw/*323.21*/("""return myNavFunction(this.id);
                """),format.raw/*324.17*/("""}"""),format.raw/*324.18*/(""",
                ajax: """),format.raw/*325.23*/("""{"""),format.raw/*325.24*/("""
                    """),format.raw/*326.21*/("""url: "show_data.php?action=1",
                    modal: true
                """),format.raw/*328.17*/("""}"""),format.raw/*328.18*/(""",
                legend: [
                    """),format.raw/*330.21*/("""{"""),format.raw/*330.22*/("""type: "text", label: "Special event", badge: "00""""),format.raw/*330.71*/("""}"""),format.raw/*330.72*/(""",
                    """),format.raw/*331.21*/("""{"""),format.raw/*331.22*/("""type: "block", label: "Regular event", """),format.raw/*331.61*/("""}"""),format.raw/*331.62*/("""
                """),format.raw/*332.17*/("""]
            """),format.raw/*333.13*/("""}"""),format.raw/*333.14*/(""");
        """),format.raw/*334.9*/("""}"""),format.raw/*334.10*/(""");
        
        
        function myNavFunction(id) """),format.raw/*337.36*/("""{"""),format.raw/*337.37*/("""
            """),format.raw/*338.13*/("""$("#date-popover").hide();
            var nav = $("#" + id).data("navigation");
            var to = $("#" + id).data("to");
            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
        """),format.raw/*342.9*/("""}"""),format.raw/*342.10*/("""
    """),format.raw/*343.5*/("""</script>

    <script>
        var barChartData = """),format.raw/*346.28*/("""{"""),format.raw/*346.29*/("""
            """),format.raw/*347.13*/("""labels : ["January","February","March","April","May","June","July"],
            datasets : [
                """),format.raw/*349.17*/("""{"""),format.raw/*349.18*/("""
                    """),format.raw/*350.21*/("""fillColor : "rgba(220,220,220,0.5)",
                    strokeColor : "rgba(220,220,220,1)",
                    data : [65,59,90,81,56,55,40]
                """),format.raw/*353.17*/("""}"""),format.raw/*353.18*/(""",
                """),format.raw/*354.17*/("""{"""),format.raw/*354.18*/("""
                    """),format.raw/*355.21*/("""fillColor : "rgba(151,187,205,0.5)",
                    strokeColor : "rgba(151,187,205,1)",
                    data : [28,48,40,19,96,27,100]
                """),format.raw/*358.17*/("""}"""),format.raw/*358.18*/("""
            """),format.raw/*359.13*/("""]
        """),format.raw/*360.9*/("""}"""),format.raw/*360.10*/(""";
        var mybar = new Chart(document.getElementById("bar1").getContext("2d")).Bar(barChartData);
    </script> 

""")))}),format.raw/*364.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 09 18:32:36 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/dashboard.scala.html
                  HASH: e608ba4a958793023c600aa51303d82774f172c2
                  MATRIX: 802->1|841->32|880->34|912->40|964->67|1000->83|1036->93|1458->488|1473->494|1537->536|2099->1071|2114->1077|2166->1108|3097->2012|3112->2018|3164->2049|3738->2596|3753->2602|3812->2639|4947->3746|4976->3747|5053->3796|5200->3915|5229->3916|5303->3962|5332->3963|5409->4012|5559->4134|5588->4135|5657->4176|17774->16266|17804->16274|17838->16280|17960->16373|17990->16374|18032->16387|18090->16416|18120->16417|18178->16446|18208->16447|18329->16539|18359->16540|18405->16557|18462->16585|18492->16586|18579->16644|18609->16645|18655->16662|18704->16682|18734->16683|18784->16704|18868->16759|18898->16760|18969->16802|18999->16803|19049->16824|19125->16871|19155->16872|19208->16896|19238->16897|19288->16918|19396->16997|19426->16998|19503->17046|19533->17047|19611->17096|19641->17097|19692->17119|19722->17120|19790->17159|19820->17160|19866->17177|19909->17191|19939->17192|19978->17203|20008->17204|20093->17260|20123->17261|20165->17274|20403->17484|20433->17485|20466->17490|20546->17541|20576->17542|20618->17555|20757->17665|20787->17666|20837->17687|21026->17847|21056->17848|21103->17866|21133->17867|21183->17888|21373->18049|21403->18050|21445->18063|21483->18073|21513->18074|21662->18192
                  LINES: 29->1|29->1|29->1|31->3|33->5|33->5|35->7|44->16|44->16|44->16|53->25|53->25|53->25|69->41|69->41|69->41|78->50|78->50|78->50|100->72|100->72|101->73|103->75|103->75|104->76|104->76|105->77|107->79|107->79|108->80|334->306|334->306|336->308|339->311|339->311|340->312|340->312|340->312|340->312|340->312|342->314|342->314|343->315|344->316|344->316|346->318|346->318|347->319|347->319|347->319|348->320|349->321|349->321|350->322|350->322|351->323|352->324|352->324|353->325|353->325|354->326|356->328|356->328|358->330|358->330|358->330|358->330|359->331|359->331|359->331|359->331|360->332|361->333|361->333|362->334|362->334|365->337|365->337|366->338|370->342|370->342|371->343|374->346|374->346|375->347|377->349|377->349|378->350|381->353|381->353|382->354|382->354|383->355|386->358|386->358|387->359|388->360|388->360|392->364
                  -- GENERATED --
              */
          