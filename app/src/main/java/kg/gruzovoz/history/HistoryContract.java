package kg.gruzovoz.history;

import java.util.List;

import kg.gruzovoz.BaseContract;
import kg.gruzovoz.models.Order;

public interface HistoryContract {

    interface View extends BaseContract.BaseView {
        void setOrders(List<Order> orders);
    }

    interface Presenter extends BaseContract.BasePresenter{

    }

}
