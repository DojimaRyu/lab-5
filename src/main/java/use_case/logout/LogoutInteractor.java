package use_case.logout;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
        // DONE: save the DAO and Presenter in the instance variables.
        // Which parameter is the DAO and which is the presenter?
    }

    @Override
    public void execute(LogoutInputData logoutInputData) {
        // DONE: implement the logic of the Logout Use Case (depends on the LogoutInputData.java)
        // * get the username out of the input data,
        // * set the username to null in the DAO
        // * instantiate the `LogoutOutputData`, which needs to contain the username.
        // * tell the presenter to prepare a success view.
        final String username = logoutInputData.getUsername();
        userDataAccessObject.setCurrentUsername(null);

        final LogoutOutputData logoutOutputData = new LogoutOutputData(username, false);

        logoutPresenter.prepareSuccessView(logoutOutputData);
    }
}

