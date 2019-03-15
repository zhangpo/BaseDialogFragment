package com.example.huangyachong.myapplication;

import android.support.annotation.LayoutRes;

import com.example.huangyachong.myapplication.widget.BaseDialog;
import com.example.huangyachong.myapplication.widget.ViewConvertListener;
import com.example.huangyachong.myapplication.widget.ViewHolder;


/**
 * 公用样式Dialog
 */
public class CommonDialog extends BaseDialog {
    private ViewConvertListener convertListener;

    public static CommonDialog newInstance() {
        CommonDialog dialog = new CommonDialog();
        return dialog;
    }

    /**
     * 设置Dialog布局
     *
     * @param layoutId
     * @return
     */
    public CommonDialog setLayoutId(@LayoutRes int layoutId) {
        this.mLayoutResId = layoutId;
        return this;
    }

    @Override
    public int setUpLayoutId() {
        return mLayoutResId;
    }

    @Override
    public void convertView(ViewHolder holder, BaseDialog dialog) {
        if (convertListener != null) {
            convertListener.convertView(holder, dialog);
        }
    }

    public CommonDialog setConvertListener(ViewConvertListener convertListener) {
        this.convertListener = convertListener;
        return this;
    }
}
