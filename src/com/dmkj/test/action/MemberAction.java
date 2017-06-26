package com.dmkj.test.action;

import com.dmkj.test.form.MemberActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by segment on 2017/6/12.
 */
public class MemberAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MemberActionForm maForm = (MemberActionForm) form;
        System.out.println("memberAction is running");
        return null;
    }
}
