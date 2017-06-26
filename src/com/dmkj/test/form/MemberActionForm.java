package com.dmkj.test.form;

import com.dmkj.test.vo.Member;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Created by segment on 2017/6/12.
 */
public class MemberActionForm extends ActionForm {
    private Member member = new Member();

    public Member getMember() {
        return member;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, javax.servlet.http.HttpServletRequest request) {
        System.out.println("acitonform is loding!!");
        return null;
    }
}
