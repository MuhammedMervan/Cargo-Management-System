package com.Packagee;


  public class arac {

    private int id;
    private String vehicleNo;
    private int capacity;
    private konum currentPosition;
    private aracDurumu currentStatus;

    public arac(int id, String vehicleNo, int capacity)
    {
      this.id = id;
      this.vehicleNo = vehicleNo;
      this.capacity = capacity;
    }

    public int getId()
    {
      return id;
    }

    public void setId(int id)
    {
      this.id = id;
    }

    public String getVehicleNo()
    {
      return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo)
    {
      this.vehicleNo = vehicleNo;
    }

    public int getCapacity()
    {
      return capacity;
    }

    public void setCapacity(int capacity)
    {
      this.capacity = capacity;
    }

    public konum getCurrentPosition()
    {
      return currentPosition;
    }

    public void setCurrentPosition(konum currentPosition)
    {
      this.currentPosition = currentPosition;
    }

    public aracDurumu getCurrentStatus()
    {
      return currentStatus;
    }

    public void setCurrentStatus(aracDurumu currentStatus)
    {
      this.currentStatus = currentStatus;
    }
  }




