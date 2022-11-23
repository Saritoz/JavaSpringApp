<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Authentication</title>
    <link rel="stylesheet" href="../../css/admin/login.css">
</head>
<body>
    <section class="login-admin d-flex justify-content-center align-items-center">
        <div class="login-box">
            <form action="" method="" class="needs-validation mx-4 my-2" novalidate>
                <p class="text-center fs-3">Login</p>
                <div class="mb-3">
                    <label for="admin-username" class="form-label">Username</label>
                    <input type="text" class="form-control" id="admin-username" value="" placeholder="username" required>
                    <div class="invalid-feedback">
                    Please enter username!
                    </div>
                </div>
                <div class="mb-3">
                    <label for="admin-password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="admin-password" value="" placeholder="password" required>
                    <div class="invalid-feedback">
                    Please enter password!
                    </div>
                </div>
                <button class="btn btn-success px-5 py-2">Login</button>
            </form>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
</body>
</html>