<%-- 
    Document   : login
    Created on : Aug 7, 2022, 1:07:21 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="<c:url value ="/css/style.css"/>" />


<c:if test="${param.error !=null}" >
    <div class ="alert alert-danger">
       Username hoặc mật khẩu không đúng! Vui lòng nhập lại.
    </div>

</c:if>


<c:url value="/login" var="action"/>
<form method="post" action="${action}">
    <section class="vh-100 gradient-custom">
        <div class="container py-5 h-100" >
            <div class="row d-flex justify-content-center align-items-center h-100" style="margin: 15px">
                <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                    <div class="card bg-dark text-white" style="border: 5px solid #ccc!important">
                        <div class="card-body p-5 text-center" style="background-color: #282A35; max-height: 700px"    >

                            <div class="mb-md-5 mt-md-4 pb-5" >

                                <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
                                <p class="text-white-50 mb-5">Please enter your login and password!</p>

                                <div class="form-outline form-white mb-4">
                                    <input type="text"  class="form-control form-control-lg" id="username" name="username"  required/>
                                    <label class="form-label" for="typeEmailX">Username</label>
                                </div>

                                <div class="form-outline form-white mb-4">
                                    <input type="password" id="typePasswordX" class="form-control form-control-lg" id="password" name="password" required/>
                                    <label class="form-label" for="typePasswordX">Password</label>
                                </div>

                                <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="#!">Forgot password?</a></p>

                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Login</button>

                                <div class="d-flex justify-content-center text-center mt-4 pt-1">
                                    <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                                    <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                                    <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
                                </div>

                            </div>
                            <div>
                                <p class="mb-0">Don't have an account? <a href="#!" class="text-white-50 fw-bold">Sign Up</a>
                                </p>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</form>
