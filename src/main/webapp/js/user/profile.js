const changePasswordModal = new bootstrap.Modal(
  document.querySelector("#changepassword"),
  {}
);

const editModal = new bootstrap.Modal(
  document.querySelector("#editaccount"),
  {}
);

const deleteModal = new bootstrap.Modal(
  document.querySelector("#deleteaccount"),
  {}
);

function openchangePasswordModal() {
  changePasswordModal.show();
  const check_confirm = document.querySelector("#check-confirm");
  check_confirm.hidden = true;
  check_confirm.innerHTML = "";
  const btn_confirm = document.querySelector("#btn-confirm");
  const password = document.querySelector("#password");
  const confirm_password = document.querySelector("#confirm-password");

  btn_confirm.addEventListener("click", () => {
    if (password.value === confirm_password.value) {
      $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/changepassword",
        data: password.value,
        dataType: "json",
        cache: false,
        timeout: 600000,
        success: function (data) {
          console.log(data);
        },
        error: function (e) {
          console.log("ERROR : ", e);
        },
      });
      password.value = "";
      confirm_password.value = "";
    } else if (password.value !== confirm_password.value) {
      check_confirm.innerHTML = "Mật khẩu không trùng khớp!";
      check_confirm.hidden = false;
    } else {
      check_confirm.innerHTML = "Vui lòng điền đầy đủ thông tin!";
      check_confirm.hidden = false;
    }
  });
}

function openEditModal() {
  editModal.show();
  const check_confirm_edit = document.querySelector("#check-confirm-edit");
  check_confirm_edit.hidden = true;
  const fullname = document.querySelector("#fullname");
  const email = document.querySelector("#email");
  const btn_edit = document.querySelector("#btn-edit");

  btn_edit.addEventListener("click", () => {
    if (fullname.value != "" && email.value != "") {
      const form = document.createElement("form");
      form.setAttribute("method", "post");
      form.setAttribute("action", "/editaccount");
      const FN1 = document.createElement("input");
      FN1.setAttribute("type", "text");
      FN1.setAttribute("name", "fullname");
      FN1.setAttribute("value", fullname.value);
      FN1.hidden = true;
      form.appendChild(FN1);
      const FN2 = document.createElement("input");
      FN2.setAttribute("type", "text");
      FN2.setAttribute("name", "email");
      FN2.setAttribute("value", email.value);
      FN2.hidden = true;
      form.appendChild(FN2);
      document.getElementsByTagName("body")[0].appendChild(form);
      form.submit();
    } else {
      check_confirm_edit.hidden = false;
    }
  });
}

function openDeleteModal() {
  deleteModal.show();
  const btn_delete = document.querySelector("#btn-delete");

  btn_delete.addEventListener("click", () => {
    const form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", "/deleteaccount");
    document.getElementsByTagName("body")[0].appendChild(form);
    form.submit();
  });
}
