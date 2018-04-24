/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcBulletinField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBulletinField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBulletinField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcBulletinField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_TradingDay_get(swigCPtr, this);
  }

  public void setBulletinID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_BulletinID_set(swigCPtr, this, value);
  }

  public int getBulletinID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_BulletinID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_SequenceNo_get(swigCPtr, this);
  }

  public void setNewsType(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_NewsType_set(swigCPtr, this, value);
  }

  public String getNewsType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_NewsType_get(swigCPtr, this);
  }

  public void setNewsUrgency(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_NewsUrgency_set(swigCPtr, this, value);
  }

  public char getNewsUrgency() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_NewsUrgency_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_SendTime_get(swigCPtr, this);
  }

  public void setAbstract(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_Abstract_set(swigCPtr, this, value);
  }

  public String getAbstract() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_Abstract_get(swigCPtr, this);
  }

  public void setComeFrom(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_ComeFrom_set(swigCPtr, this, value);
  }

  public String getComeFrom() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_ComeFrom_get(swigCPtr, this);
  }

  public void setContent(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_Content_get(swigCPtr, this);
  }

  public void setURLLink(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_URLLink_set(swigCPtr, this, value);
  }

  public String getURLLink() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_URLLink_get(swigCPtr, this);
  }

  public void setMarketID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_MarketID_set(swigCPtr, this, value);
  }

  public String getMarketID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBulletinField_MarketID_get(swigCPtr, this);
  }

  public CThostFtdcBulletinField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcBulletinField(), true);
  }

}