package jp.co.systena.tigerscave.springtest.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.model.Cart;
import jp.co.systena.tigerscave.springtest.model.ListService;
import jp.co.systena.tigerscave.springtest.model.Listform;
import jp.co.systena.tigerscave.springtest.model.Order;

@Controller
public class ListController {

  @Autowired
  HttpSession session;  //セッション管理
//  private ListService ListService;

  @RequestMapping(value = "/", method = RequestMethod.GET)    // URLとのマッピング
  public ModelAndView show(ModelAndView mav) {

    mav.addObject("itemList", ListService.getItemList());

    // Viewのテンプレート名を設定
    mav.setViewName("/ListView");
    return mav;
    }

  @RequestMapping(value="/CartView", method = RequestMethod.POST)  // URLとのマッピング
  public ModelAndView order(@Valid Listform form, ModelAndView mav,
                             @RequestParam(value = "orderId") int[] orderId,
                             @RequestParam(value = "orderName") String[] orderName,
                             @RequestParam(value = "orderPrice") int[] orderPrice,
                             @RequestParam(value = "orderNum") int[] orderNum) {

        // Viewのテンプレート名を設定
        mav.setViewName("/CartView");

        Cart cart = getCart();

        Listform listform = new Listform();
        listform.setItemId(orderId);
        listform.setName(orderName);
        listform.setPrice(orderPrice);
        listform.setNum(orderNum);

        int TotalPrice = 0;

        int size = ListService.getItemList().size();
        for(int i = 0; i < size; i++) {
          Order order = new Order();
          int[] OrderId = listform.getItemId();
          String[] OrderName = listform.getName();
          int[] OrderPrice = listform.getPrice();
          int[] OrderNum = listform.getNum();
          order.setItemId(OrderId[i]);
          order.setName(OrderName[i]);
          order.setPrice(OrderPrice[i]);
          order.setNum(OrderNum[i]);
          cart.add(order);

          TotalPrice += OrderPrice[i] * OrderNum[i];
       }
        mav.addObject("orderList", cart.getOrderList());

        mav.addObject("TotalPrice", TotalPrice);

        session.setAttribute("cart", cart);

        return mav;
    }


  private Cart getCart() {
    Cart cart = (Cart) session.getAttribute("cart");
    if (cart == null) {
      cart = new Cart();
      session.setAttribute("cart", cart);
    }

    return cart;
  }

}