
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
object commonTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.7*/("""<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
            <a href="index.html" class="logo"><b>SMART APP</b></a>
            <!--logo end-->
            <div class="top-menu">
                <ul class="nav pull-right top-menu">
                    <li><a class="logout" href="login.html">Logout</a></li>
                </ul>
            </div>
        </header>
      <!--header end-->
<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">

                  <p class="centered"><a href="profile.html"><img src=""""),_display_(/*28.73*/routes/*28.79*/.Assets.at("images/tible.png")),format.raw/*28.109*/("""" class="img-circle" width="60" style="background-color: white;"></a></p>
                  <h5 class="centered">Admin</h5>

                  <li class="mt">
                      <a href=""""),_display_(/*32.33*/controllers/*32.44*/.routes.Application.dashboard()),format.raw/*32.75*/("""">
                          <i class="fa fa-dashboard"></i>
                          <span>Dashboard</span>
                      </a>
                  </li>

                 <li class="sub-menu">
                      <a href=""""),_display_(/*39.33*/controllers/*39.44*/.routes.Application.viewCowDetails()),format.raw/*39.80*/("""" >
                          <i class="fa fa-desktop"></i>
                          <span>Individual Cow Details</span>
                      </a>
                  </li>
                        <li class="sub-menu">
                      <a href=""""),_display_(/*45.33*/controllers/*45.44*/.routes.Application.simulationProcess()),format.raw/*45.83*/("""" >
                          <i class="fa fa-desktop"></i>
                          <span>Simulation</span>
                      </a>
                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 01:28:40 PDT 2015
                  SOURCE: /home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/app/views/commonTemplate.scala.html
                  HASH: a28791c9a83a0fff876cb247ac673aa82b8e46d4
                  MATRIX: 807->6|2440->1612|2455->1618|2507->1648|2725->1839|2745->1850|2797->1881|3057->2114|3077->2125|3134->2161|3412->2412|3432->2423|3492->2462
                  LINES: 29->1|56->28|56->28|56->28|60->32|60->32|60->32|67->39|67->39|67->39|73->45|73->45|73->45
                  -- GENERATED --
              */
          