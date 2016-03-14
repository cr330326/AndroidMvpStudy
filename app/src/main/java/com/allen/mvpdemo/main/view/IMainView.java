package com.allen.mvpdemo.main.view;

import android.content.Context;
import android.widget.ListView;

/**
 * 视图接口
 * Created by ChenRan on 2016-2-25.
 */
public interface IMainView {
	void onShowList();
	void onSetProgressBarVisibility(int visibility);
	ListView getListView();
	Context getContext();
}
