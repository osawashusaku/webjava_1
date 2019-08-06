package jp.co.systena.tigerscave.springtest.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.model.Cart;
import jp.co.systena.tigerscave.springtest.model.ListService;
import jp.co.systena.tigerscave.springtest.model.Listform;

@Controller
public class ListController {

  @Autowired
  HttpSession session;
//  private ListService ListService;

  @RequestMapping(value="/", method = RequestMethod.GET)          // URLとのマッピング
  public ModelAndView show(ModelAndView mav) {

    // Viewのテンプレート名を設定
    mav.setViewName("/ListView");
    mav.addObject("itemList", ListService.getItemList());
    return mav;
    }

  @RequestMapping(value="/CartView", method = RequestMethod.POST)  // URLとのマッピング
  public ModelAndView order(Listform form, ModelAndView mav, @RequestParam(value = "num") int[] num) {

        // Viewのテンプレート名を設定
        mav.setViewName("/CartView");

        Listform Listform = new Listform();
        Listform.setNum(num);

        Cart Cart = new Cart();
        mav.addObject("orderList", Cart.getOrderList(Listform.getNum()));

        return mav;
    }


}