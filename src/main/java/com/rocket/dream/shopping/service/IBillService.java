package com.rocket.dream.shopping.service; /***********************************************************************
 * Module:  IBillService.java
 * Author:  zhaoy
 * Purpose: Defines the Interface IBillService
 ***********************************************************************/

import com.rocket.dream.shopping.pojo.Bill;

import java.util.*;

/** @pdOid 92446500-ed1e-4c12-ab24-dc14a785191f */
public interface IBillService {
   /** @param bill
    * @pdOid 80669a9e-b0e8-44ef-899c-44bb1e1b6475 */
   List<Bill> selectNewBills(Bill bill);
   /** @param bill
    * @pdOid d4dbcd59-fa1e-46ad-8706-8728923c7358 */
   List<Bill> selectDigital(Bill bill);
   /** @param bill
    * @pdOid 88b7dc83-573d-46bf-ba86-44aa45ee0dd0 */
   List<Bill> selectUnusedElectricalAppliances(Bill bill);
   /** @param bill
    * @pdOid df13736f-ce49-4631-94fe-3b00e6af8925 */
   List<Bill> selectIdleBooks(Bill bill);
   /** @param bill
    * @pdOid aebbfcd3-5f00-4053-b0b8-21a6c28e08b1 */
   List<Bill> selectIdleMotion(Bill bill);
   /** @pdOid 8a9f3de3-e6db-4df7-93d9-df2254e4ea1e */
   List<String> selectSchoolImages();

}