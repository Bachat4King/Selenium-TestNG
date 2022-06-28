package tests;

import data.factory.UserModelFactory;
import models.UserModel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

/**
 * Author: Bastian Silva
 */
@Listeners(listeners.TestNGListeners.class)
public class Tests extends BaseTest {


    @Test
    public void register() {

        UserModel userModel = UserModelFactory.validUser();

        HomePage homePage = new HomePage();
        homePage.pressSingIn();

        LoginPage loginPage = new LoginPage();
        loginPage.clickLink("Create a new account");

        RegisterPage registerPage = new RegisterPage();
        registerPage.register(userModel.getFirstName(), userModel.getLastName(), userModel.getEmail(), userModel.getPassword());

        DashboardPage dashboardPage = new DashboardPage();
        String username = dashboardPage.getUsername();

        Assert.assertTrue(username.strip().startsWith(userModel.getFirstName()), "Username is not correct");

    }

    @Test
    public void validLogin() {

        UserModel userModel = UserModelFactory.loginUser();

        HomePage homePage = new HomePage();
        homePage.pressSingIn();

        LoginPage loginPage = new LoginPage();
        loginPage.login(userModel.getEmail(), userModel.getPassword());

        DashboardPage dashboardPage = new DashboardPage();
        String username = dashboardPage.getUsername();

        Assert.assertEquals(username.strip(), "test u", "Username is not correct");

    }

    @Test
    public void invalidLogin() {

        UserModel userModel = UserModelFactory.invalidInformation();

        HomePage homePage = new HomePage();
        homePage.pressSingIn();

        LoginPage loginPage = new LoginPage();
        loginPage.login(userModel.getEmail(), userModel.getPassword());

        Assert.assertEquals(loginPage.getSingleErrorMessage(), "Invalid email or password.", "Error message is not correct");
    }

    @Test
    public void watchReactVideo() {

        UserModel userModel = UserModelFactory.loginUser();

        HomePage homePage = new HomePage();
        homePage.pressSingIn();

        LoginPage loginPage = new LoginPage();
        loginPage.login(userModel.getEmail(), userModel.getPassword());

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickCourseCard("Modern React and NodeJS Development");

        CoursePage coursePage = new CoursePage();
        coursePage.playIntroductionVideo();
    }

    @Test
    public void resetPassword() {

        UserModel userModel = UserModelFactory.loginUser();

        HomePage homePage = new HomePage();
        homePage.pressSingIn();

        LoginPage loginPage = new LoginPage();
        loginPage.clickLink("Forgot Password?");

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.resetPassword(userModel.getEmail());

        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        Assert.assertEquals(resetPasswordPage.getMessage(), "Help is on the way!", "Message is not correct");

    }

}
