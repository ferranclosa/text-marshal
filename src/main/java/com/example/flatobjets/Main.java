package com.example.flatobjets;

import com.example.flatobjets.model.converters.*;
import com.example.flatobjets.model.enums.BooleanPatterns;
import com.example.flatobjets.model.enums.DatePatterns;
import com.example.flatobjets.model.enums.PadPosition;
import com.example.flatobjets.model.messages.Customerquery;
import com.example.flatobjets.model.messages.SupplierAnswer;
import com.example.flatobjets.model.messages.Supplierquery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Main implements CommandLineRunner{


    @Override
    public void run(String... args) throws Exception {

        Customerquery cq = new Customerquery();
        cq.setCodeSiren("12347");
        cq.setCustName("MARIN");
        cq.setCarmCustomer(true);
        cq.setEngagedDate(LocalDate.now().plusDays(2));
        cq.setCustBalance(189946L);
        cq.setProgramToCall("AV71");
        System.out.println(cq.toString());

        Supplierquery sq = new Supplierquery();
        sq.setCodeSiren("77777");
        sq.setSupplierName("INB AND COLLEAGUES");
        sq.setCarmCustomer(false);
        sq.setLastOrderServed(LocalDate.now().minusDays(45));
        sq.setCustBalance(4L);
        sq.setProgramToCall("HYD6");
        System.out.println(sq.marshal());

        String answer = "02RCI     098HUBBY        SHOES AND BITS                                                                                      0000067520010102";

        System.out.println("Original reply = > " + answer);

        SupplierAnswer sa = new SupplierAnswer();

        sa.unmarshal(answer);

        System.out.println("After unmarshal = > " + sa.toString());


    }
}
