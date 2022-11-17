<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="../css/login.css">
</head>
<body>
    <section class="validation-box">
        <div class="validation-container">
            <div class="bg-container">
                <div class="box signin">
                    <div class="fs-5 text-white mb-2">Already have an Account ?</div>
                    <button class="ct-btn signinBtn" style="--ct-color: #00ff00">Sign in</button>
                </div>
                <div class="box signup">
                    <div class="fs-5 text-white mb-2">Don't have an account ?</div>
                    <button class="ct-btn signupBtn" style="--ct-color: #ff0000">Sign up</button>
                </div>
            </div>
            <div class="formBox">
                <div class="form siginForm">
                    <form action="" method="post">
                        <div class="fs-4 form-title">Sign in</div>
                        <input class="form-input" type="text" placeholder="username" autocomplete="off" name="username">
                        <input class="form-input" type="password" placeholder="password" name="password">
                        <input class="form-input" type="submit" value="Log in" style="--ct-color: #03a9f4">
                        <a href="">Forgot password</a>
                    </form>
                </div>

                <div class="form signupForm">
                    <form action="" method="post">
                        <div class="fs-4 form-title">Sign up</div>
                        <input class="form-input" type="text" placeholder="username" autocomplete="off" name="username">
                        <input class="form-input" type="text" placeholder="fullname" autocomplete="off" name="fullname">
                        <input class="form-input" type="email" placeholder="email" autocomplete="off" name="email">
                        <input class="form-input" type="password" placeholder="password" name="password">
                        <input class="form-input" type="password" placeholder="confirm password" name="confirm-password">
                        <input class="form-input" type="submit" value="Sign up" style="--ct-color: #f43648">
                    </form>
                </div>
            </div>
        </div>
    </section>

    <script src="../js/login.js"></script>
</body>
</html>