<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <div class="m-5">
    
    <table class="table table-hover">
      <thead class="text-center">
        <tr>
          <th>ID</th>
          <th>Username</th>
          <th>Fullname</th>
          <th>Email</th>
          <th>Password</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody class="text-center">
        <tr>
          <td>1</td>
          <td>Sarito</td>
          <td>Ozzuro Sarito</td>
          <td>abc@gmail.com</td>
          <td>Hash Password</td>
          <td><a class="text-info me-2" href="#" data-bs-toggle="modal" data-bs-target="#modalHandleReset">Reset</a>
            <a class="text-danger" href="#" data-bs-toggle="modal" data-bs-target="#modalHandleRDelete">Delete</a></td>
        </tr>
      </tbody>
    </table>
  </div>

  <jsp:include page="../../components/confirmModal.jsp">
    <jsp:param name="idModal" value="modalHandleReset" />
    <jsp:param name="titleModal" value="Reset Account" />
    <jsp:param name="contentModal" value="Are you sure to reset this account?" />
  </jsp:include>
  <jsp:include page="../../components/confirmModal.jsp">
    <jsp:param name="idModal" value="modalHandleRDelete" />
    <jsp:param name="titleModal" value="Delete Account" />
    <jsp:param name="contentModal" value="Are you sure to delete this account?" />
  </jsp:include>