<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ADMIN PANEL | MSP Tool</title>

<link rel="stylesheet" href="css/formstyle.css" />
<script type="text/javascript">
	
	function verify() {
		
		var userName= document.getElementById("user_name").value;
		var password= document.getElementById("password").value;
		if(userName == "") {
			alert("Please enter username");
			//obj.user_name.focus();
			return false;
		}
		if(password == "") {
			alert("Please enter password");
			//obj.password.focus();
			return false;
		}
		return true;
	}
	
</script>

</head>
<body>

<div id="wrapper">
  <div id="header">
    <div class="gipnfclogo mlrauto">MSP Tool</div>
    <br class="clr" />
  </div>
  <div id="container">
    <div class="container_fixedarea">
      <div class="mainheadingbox">
        <div class="mhboxleft mlrauto"> MSP Tool Login</div>
      </div>
    </div>
    <div class="container_scrollarea">
      <div id="login_form_box">
       
         <form autocomplete="off" target="_top" action="loginUser" method="post" >
         
         
         <div class="inputs">
            <div class="inputbox">
              <p>
                <label for="username">User Name</label>
              </p>
              <span>
              	<input class="txtbox inputbox" type="text" name="userName" id="user_name" size="54" />              
              </span></div>
            <div class="inputbox">
              <p>
                <label for="password">Password</label>
              </p>
              <span>
              <input class="inputbox" type="password" name="password" id="password" autocomplete="off"/>             
              </span></div>
            <div class="inputbox">
            
            </div>
            <div class="inputbox">
              <input type="submit" value="Login" name="Login" id="Login" class="loginButton" onclick="return verify();" />
             
          </div>
          </div>
          
        </form>
      
      </div>
    </div>
  </div>
</div>
</body>
</html>