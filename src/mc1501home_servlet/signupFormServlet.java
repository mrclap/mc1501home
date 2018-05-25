package mc1501home_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/signupFormServlet")
public class signupFormServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String host = request.getContextPath();
		
		//contents type 결정
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<!-- saved from url=(0040)http://bootstrapk.com/examples/carousel/ -->\r\n" + 
				"<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
				"    \r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n" + 
				"    <meta name=\"description\" content=\"\">\r\n" + 
				"    <meta name=\"author\" content=\"\">\r\n" + 
				"    <link rel=\"icon\" href=\"http://bootstrapk.com/favicon.ico\">\r\n" + 
				"\r\n" + 
				"    <title>Carousel Template for Bootstrap</title>\r\n" + 
				"\r\n" + 
				"    <!-- Bootstrap core CSS -->\r\n" + 
				"    <link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\r\n" + 
				"\r\n" + 
				"    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n" + 
				"    <!--[if lt IE 9]><script src=\"./../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n" + 
				"    <script src=\"./js/ie-emulation-modes-warning.js\"></script>\r\n" + 
				"\r\n" + 
				"    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n" + 
				"    <!--[if lt IE 9]>\r\n" + 
				"      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n" + 
				"      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n" + 
				"    <![endif]-->\r\n" + 
				"\r\n" + 
				"    <!-- Custom styles for this template -->\r\n" + 
				"    <link href=\"./css/carousel.css\" rel=\"stylesheet\">\r\n" + 
				"    \r\n" + 
				"    <!-- ********************************************** -->\r\n" + 
				"    <script src=\"./js/jquery-3.3.1.min.js\"></script>\r\n" + 
				"    <!-- signup js -->\r\n" + 
				"    \r\n" + 
				"    <script>\r\n" + 
				"    // email chekcer\r\n" + 
				"    function email_check( email ) {\r\n" + 
				"        \r\n" + 
				"        var regex = /([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$/;\r\n" + 
				"        return (email != '' && email != 'undefined' && regex.test(email));\r\n" + 
				"     \r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"	  /* \r\n" + 
				"	  <div class=\"form-group has-success has-feedback\">\r\n" + 
				"  		<label class=\"control-label\" for=\"inputSuccess2\">Input with success</label>\r\n" + 
				"		<input type=\"text\" class=\"form-control\" id=\"inputSuccess2\" aria-describedby=\"inputSuccess2Status\">\r\n" + 
				"		<span class=\"glyphicon glyphicon-ok form-control-feedback\" aria-hidden=\"true\"></span>\r\n" + 
				"		<span id=\"inputSuccess2Status\" class=\"sr-only\">(success)</span>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"      <span id=\"emailCheckSymbol\"></span>\r\n" + 
				"      <span id=\"emailCheckSymbolStatus\"></span>\r\n" + 
				"	  \r\n" + 
				"	  */\r\n" + 
				"    \r\n" + 
				"    	$(function(){\r\n" + 
				"    		//1. email check( \"@\", \".\" )\r\n" + 
				"    		$(\"#inputEmail\").blur(function(){\r\n" + 
				"    			//1.1 if (input email is satisfied regExp)\r\n" + 
				"    			//var email = $(\"#inputEmail\");\r\n" + 
				"    			\r\n" + 
				"    				//1.1.1 입력한 이메일이 조건을 만족할 때\r\n" + 
				"    			if( email_check($(\"#inputEmail\").val()) ){\r\n" + 
				"    				\r\n" + 
				"    				$(\"#email\").attr({\"class\" : \"form-group has-success has-feedback\"});\r\n" + 
				"    				$(\"#emailCheckSymbol\").attr({\"class\" : \"glyphicon glyphicon-ok form-control-feedback\",\r\n" + 
				"    											\"aria-hidden\" : \"true\"});\r\n" + 
				"    				$(\"#emailCheckSymbolStatus\").attr({	\"class\" : \"sr-only\" });\r\n" + 
				"    				$(\"#emailCheckSymbolStatus\").text(\"(success)\");\r\n" + 
				"    			\r\n" + 
				"    				//1.1.2 입력한 이메일이 조건을 만족하지 못할 때	\r\n" + 
				"    			}else{\r\n" + 
				"    				\r\n" + 
				"    			}\r\n" + 
				"    		});\r\n" + 
				"    		\r\n" + 
				"    	});\r\n" + 
				"    </script>\r\n" + 
				"    \r\n" + 
				"    <!-- signup js over -->\r\n" + 
				"    <!-- ********************************************** -->\r\n" + 
				"  </head>\r\n" + 
				"<!-- NAVBAR\r\n" + 
				"================================================== -->\r\n" + 
				"  <body>\r\n" + 
				"    <div class=\"navbar-wrapper\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"\r\n" + 
				"        <nav class=\"navbar navbar-inverse navbar-static-top\">\r\n" + 
				"          <div class=\"container\">\r\n" + 
				"            <div class=\"navbar-header\">\r\n" + 
				"              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n" + 
				"                <span class=\"sr-only\">Toggle navigation</span>\r\n" + 
				"                <span class=\"icon-bar\"></span>\r\n" + 
				"                <span class=\"icon-bar\"></span>\r\n" + 
				"                <span class=\"icon-bar\"></span>\r\n" + 
				"              </button>\r\n" + 
				"              <a class=\"navbar-brand\" href=\"./index.html\">MC1501Group</a>\r\n" + 
				"            </div>\r\n" + 
				"            <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n" + 
				"              <ul class=\"nav navbar-nav\">\r\n" + 
				"                <li class=\"active\"><a href=\"./index.html\">Home</a></li>\r\n" + 
				"                <li><a href=\"./board/board.html\">Board</a></li>\r\n" + 
				"                <li><a href=\"./sul-go/sul-go.html\">Sul-Go?</a></li>\r\n" + 
				"                <li><a href=\"./coldhot/coldhot.html\">Cold/Hot?</a></li>\r\n" + 
				"\r\n" + 
				"                <!-- nav dropdown bar eliminated -->\r\n" + 
				"                <!-- li class=\"dropdown\">\r\n" + 
				"                  <a href=\"http://bootstrapk.com/examples/carousel/#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n" + 
				"                  <ul class=\"dropdown-menu\" role=\"menu\">\r\n" + 
				"                    <li><a href=\"http://bootstrapk.com/examples/carousel/#\">Action</a></li>\r\n" + 
				"                    <li><a href=\"http://bootstrapk.com/examples/carousel/#\">Another action</a></li>\r\n" + 
				"                    <li><a href=\"http://bootstrapk.com/examples/carousel/#\">Something else here</a></li>\r\n" + 
				"                    <li class=\"divider\"></li>\r\n" + 
				"                    <li class=\"dropdown-header\">Nav header</li>\r\n" + 
				"                    <li><a href=\"http://bootstrapk.com/examples/carousel/#\">Separated link</a></li>\r\n" + 
				"                    <li><a href=\"http://bootstrapk.com/examples/carousel/#\">One more separated link</a></li>\r\n" + 
				"                  </ul>\r\n" + 
				"                </li -->\r\n" + 
				"              <!--  leftside nav bar -->\r\n" + 
				"              </ul>\r\n" + 
				"              <ul class=\"nav navbar-nav navbar-right\">\r\n" + 
				"			     <li><a href=\"./signup/signup.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n" + 
				"			     <li><a href=\"./login/login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n" + 
				"		      </ul>              \r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </nav>\r\n" + 
				"\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <!-- Carousel\r\n" + 
				"    ================================================== -->\r\n" + 
				"    <div class=\"carousel\" style=\"height:250px; margin-bottom: 20px;\">\r\n" + 
				"        <div class=\"item\" style=\"height:200px;\">\r\n" + 
				"          <div class=\"container\">\r\n" + 
				"            <div class=\"carousel-caption\" style=\" margin-bottom: 20px;\">\r\n" + 
				"              <p  style=\"font-size:30px;\">Multicampus The Algorithm Group.</p>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"        \r\n" + 
				"      </div>\r\n" + 
				"      \r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <!-- Marketing messaging and featurettes\r\n" + 
				"    ================================================== -->\r\n" + 
				"    <!-- sign up  -->\r\n" + 
				"	<h2 class=\"col-sm-12\" style=\"text-align: center; margin-bottom:40px;\">sign up</h2>\r\n" + 
				"	\r\n" + 
				"	<!-- 1. email -->\r\n" + 
				"	<form class=\"form-horizontal\" action=\""+ host + "/signupStatusServlet\" method=\"POST\">\r\n" + 
				"	  <div class=\"form-group\" id=\"email\">\r\n" + 
				"	    <label for=\"inputEmail\" class=\"col-sm-2 control-label\">Email</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\r\n" + 
				"	      <span id=\"emailCheckSymbol\"></span>\r\n" + 
				"	      <span id=\"emailCheckSymbolStatus\"></span>\r\n" + 
				"		  <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  <!-- \r\n" + 
				"	  <div class=\"form-group has-success has-feedback\">\r\n" + 
				"  		<label class=\"control-label\" for=\"inputSuccess2\">Input with success</label>\r\n" + 
				"		<input type=\"text\" class=\"form-control\" id=\"inputSuccess2\" aria-describedby=\"inputSuccess2Status\">\r\n" + 
				"		<span class=\"glyphicon glyphicon-ok form-control-feedback\" aria-hidden=\"true\"></span>\r\n" + 
				"		<span id=\"inputSuccess2Status\" class=\"sr-only\">(success)</span>\r\n" + 
				"	  </div>\r\n" + 
				"	  -->\r\n" + 
				"	  \r\n" + 
				"	 <!-- 2. email check -->\r\n" + 
				"	  <div class=\"form-group\" >\r\n" + 
				"	    <label for=\"inputEmailCheck\" class=\"col-sm-2 control-label\">Check-Email</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"email\" name=\"emailCheck\" class=\"form-control\" id=\"inputEmailCheck\" placeholder=\"Check-Email\">\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	  <!-- 3. pw -->\r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputPassword\" class=\"col-sm-2 control-label\">Password</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"password\" name=\"password\"  class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\">\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	  <!-- 4. pw check -->\r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputPasswordCheck\" class=\"col-sm-2 control-label\">Check-Password</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"password\" name=\"passwordCheck\"  class=\"form-control\" id=\"inputPasswordCheck\" placeholder=\"Check-Password\">\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	  <!-- 5. name -->\r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputName\" class=\"col-sm-2 control-label\">Name</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"text\" name=\"name\" class=\"form-control\" id=\"inputName\" placeholder=\"Name\">\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	  <!-- 6. birthday -->\r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputBirthday\" class=\"col-sm-2 control-label\">Birthday</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"date\" name=\"birthday\" class=\"form-control\" id=\"inputBirthday\" placeholder=\"Birthday\">\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	  <!-- 7. Telephone Number -->\r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputTelNum\" class=\"col-sm-2 control-label\">Tel</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"	      <input type=\"tel\" name=\"telNum\" class=\"form-control\" id=\"inputTelNum\" placeholder=\"Telephone Num.\">\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"\r\n" + 
				"	  <!-- 8. address\r\n" + 
				"	  10 : 경기도\r\n" + 
				"	  20 : 전라도\r\n" + 
				"	  30 : 경상도\r\n" + 
				"	   -->\r\n" + 
				"	 \r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputAddr\" class=\"col-sm-2 control-label\">Address</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"		    <div class=\"btn-group btn-group-toggle\" data-toggle=\"buttons\" id=\"inputAddr\">\r\n" + 
				"			<label class=\"btn btn-secondary active\">\r\n" + 
				"		    	<input type=\"radio\" name=\"addr\" value=\"10\" autocomplete=\"off\" checked> 경기도\r\n" + 
				"		 	</label>\r\n" + 
				"		    <label class=\"btn btn-secondary\">\r\n" + 
				"		    	<input type=\"radio\" name=\"addr\" value=\"20\" autocomplete=\"off\"> 전라도\r\n" + 
				"		  	</label>\r\n" + 
				"		  	<label class=\"btn btn-secondary\">\r\n" + 
				"		    	<input type=\"radio\" name=\"addr\" value=\"30\" autocomplete=\"off\"> 경상도\r\n" + 
				"		  	</label>\r\n" + 
				"		</div>\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	   <!-- 9. hobby\r\n" + 
				"	  100 : 수영\r\n" + 
				"	  200 : 음악감상\r\n" + 
				"	  300 : 공부\r\n" + 
				"	   -->\r\n" + 
				"	 \r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <label for=\"inputHobbies\" class=\"col-sm-2 control-label\">Hobby</label>\r\n" + 
				"	    <div class=\"col-sm-9\">\r\n" + 
				"		    <div class=\"btn-group btn-group-toggle\" data-toggle=\"buttons\" id=\"inputHobbies\">\r\n" + 
				"			<label class=\"btn btn-secondary\">\r\n" + 
				"		    	<input type=\"checkbox\" name=\"hobbies\" value=\"100\" > 수영\r\n" + 
				"		 	</label>\r\n" + 
				"		    <label class=\"btn btn-secondary\">\r\n" + 
				"		    	<input type=\"checkBox\" name=\"hobbies\" value=\"200\" > 음악감상\r\n" + 
				"		  	</label>\r\n" + 
				"		  	<label class=\"btn btn-secondary\">\r\n" + 
				"		    	<input type=\"checkBox\" name=\"hobbies\" value=\"300\" > 공부\r\n" + 
				"		  	</label>\r\n" + 
				"		</div>\r\n" + 
				"	      <p class=\"col-sm-1\"></p>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	  \r\n" + 
				"	  <div class=\"form-group\">\r\n" + 
				"	    <div class=\"col-sm-offset-2 col-sm-10\">\r\n" + 
				"	      <button type=\"submit\" class=\"btn btn-default\">sign up</button>\r\n" + 
				"	      <button type=\"submit\" class=\"btn btn-default\">cancel</button>\r\n" + 
				"	    </div>\r\n" + 
				"	  </div>\r\n" + 
				"	</form>\r\n" + 
				"\r\n" + 
				"    <!-- Bootstrap core JavaScript\r\n" + 
				"    ================================================== -->\r\n" + 
				"    <!-- Placed at the end of the document so the pages load faster -->\r\n" + 
				"    <script src=\"./js/jquery.min.js\"></script>\r\n" + 
				"    <script src=\"./js/bootstrap.min.js\"></script>\r\n" + 
				"    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->\r\n" + 
				"    <script src=\"./js/holder.js\"></script>\r\n" + 
				"    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n" + 
				"    <script src=\"./js/ie10-viewport-bug-workaround.js\"></script>\r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"500\" height=\"500\" viewBox=\"0 0 500 500\" preserveAspectRatio=\"none\" style=\"visibility: hidden; position: absolute; top: -100%; left: -100%;\"><defs></defs><text x=\"0\" y=\"23\" style=\"font-weight:bold;font-size:23pt;font-family:Arial, Helvetica, Open Sans, sans-serif;dominant-baseline:middle\">500x500</text></svg></body></html>");
	}
}
