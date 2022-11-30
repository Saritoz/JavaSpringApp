<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="../../css/user/login.css">
    <link rel="stylesheet" href="../../css/popup.css">
</head>
<body>
    <div id="pp-toast">
        
    </div>
    <section class="validation-box">
        <div class="validation-container">
            <div class="bg-container">
                <div class="box signin">
                    <div class="fs-5 text-white mb-2">Already have an Account ?</div>
                    <button class="ct-btn changeSigninFormBtn" style="--ct-color: #f43648">Sign in</button>
                </div>
                <div class="box signup">
                    <div class="fs-5 text-white mb-2">Don't have an account ?</div>
                    <button class="ct-btn changeSignupFormBtn" style="--ct-color: #03a9f4">Sign up</button>
                </div>
            </div>
            <div class="formBox">
                <div class="form siginForm">
                    <form action="/login" method="post">
                        <div class="fs-4 form-title">Sign in</div>
                        <input id="login-username" name="login-username"  value="${login-username!=0?login-username:''}"  class="form-input" type="text" placeholder="Username" autocomplete="off">
                        <input id="login-password" name="login-password" class="form-input" type="password" placeholder="Password">
                        <div id="login-message" class="text-danger mb-2"></div>
                        <input id="btnLogin" class="form-input" type="submit" value="Log in" style="--ct-color: #03a9f4">
                        <a href="">Forgot password</a>
                    </form>
                </div>

                <div class="form signupForm">
                    <form action="/signup" method="post">
                        <div class="fs-4 form-title">Sign up</div>
                        <input id="signup-username" name="signup-username" value="${signup-username!=0?signup-username:''}" class="form-input" type="text" placeholder="Username" autocomplete="off">
                        <input id="signup-fullname" name="signup-fullname" value="${signup-fullname!=0?signup-fullname:''}" class="form-input" type="text" placeholder="Fullname" autocomplete="off">
                        <input id="signup-email" name="signup-email" value="${signup-email!=0?signup-email:''}"  class="form-input" type="email" placeholder="Email" autocomplete="off">
                        <input id="signup-password" name="signup-password" class="form-input" type="password" placeholder="Password">
                        <input id="signup-confirmPassword" name="signup-confirmPassword" class="form-input" type="password" placeholder="Confirm password">
                        <div id="signup-message" class="text-danger mb-2"></div>
                        <input id="btnSignup" class="form-input" type="submit" value="Sign up" style="--ct-color: #f43648">
                    </form>
                </div>
            </div>                    	
        </div>
    </section>
  
    <script src="../../js/login.js"></script>
    <script src="../../js/popup.js"></script>
    <c:forEach var="msg" items="${message}">
        <script>
            createToastPopup({color:"#0000ff", type:"info", title: "Thành công", content: "${msg}"});
        </script>
    </c:forEach> 
    <c:forEach var="err" items="${error}">
        <script>
            createToastPopup({color:"#ff0000", type:"info", title: "Lỗi", content: "${err}"});
        </script>
    </c:forEach>    
</body>
</html>