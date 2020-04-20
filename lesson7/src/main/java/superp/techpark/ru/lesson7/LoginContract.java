package superp.techpark.ru.lesson7;

public interface LoginContract {

    interface Presenter {
        void onSingInClicked(String login, String pass);
        void onViewDestroyed();
    }

    interface View {
        void showProgress();
        void hideProgress();
        void showError(String login);
        void showNextScreen();
    }
}