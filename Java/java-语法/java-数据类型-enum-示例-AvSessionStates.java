//Generated. DO NOT modify.
package com.feinno.sdk.session;

/**
 * 音视频通话的状态码
 */
public enum AvSessionStates {
    /**连接成功，正在通话，不包含响铃时间(来电和去电)*/
    Connected(3),
    /**被对方保持通话(来电和去电)*/
    Held(15),
    /**主动保持通话(来电和去电)*/
    Hold(14),
    /**被对方挂断(来电和去电)（去电对方响铃挂断为Rejected）*/
    HungUp(8),
    /**主动挂断(来电和去电)*/
    End(9),

    /**去电时尝试连接，对方响铃之前*/
    Connecting(1),
    /**去电对方不可达*/
    NotReachable(11),
    /**去电时对方正在响铃*/
    Ringing(2),
    /**去电时对方忙*/
    Busy(5),
    /**去电对方响铃，被对方挂断*/
    Rejected(7),

    /**被邀请（来电），正在响铃*/
    Invited(12),
    /**被邀请（来电）响铃后用户同意邀请（接听），此时连接尚未建立*/
    Accepted(13),

    /**连接出现错误*/
    Error(10),
    /**连接失败*/
    Failed(4),
    /**连接超时*/
    Timeout(6);

    public static boolean isNewSession(int intState) {
        AvSessionStates state = AvSessionStates.fromInt(intState);
        return state == Invited || state == Connecting;
    }

    public static boolean isEndSessionState(int state) {
        return isEndSessionState(AvSessionStates.fromInt(state));
    }

    public static boolean isEndSessionState(AvSessionStates state) {
        return (state == HungUp
                || state == End
                || state == NotReachable
                || state == Busy
                || state == Rejected
                || state == Error
                || state == Failed
                || state ==Timeout);
    }

    public static boolean isOffHookState(int state) {
        return isOffHookState(AvSessionStates.fromInt(state));
    }

    public static boolean isOffHookState(AvSessionStates state) {
        return state == Connected || state == Held || state == Hold;
    }

    public static boolean isIncomingOrOutgoingState(AvSessionStates state) {
        return state == Invited || state == Accepted || state == Ringing;
    }

    public static boolean isRingBackState(int state) {
        return state == Ringing.value();
    }

    public static boolean isRingBackState(AvSessionStates state) {
        return state == Ringing;
    }

    public static boolean isRingState(int state) {
        return state == Invited.value();
    }

    public static boolean isRingState(AvSessionStates state) {
        return state == Invited;
    }

    public static boolean isTimingState(int state) {
        return isTimingState(fromInt(state));
    }

    public static boolean isTimingState(AvSessionStates state) {
        return state == Connected || state == Held || state == Hold;
    }

    public static boolean canHungUpState(AvSessionStates state) {
        return state == Connected || state == Held || state == Hold ||
                state == Connecting || state == Ringing || state == Invited || state == Accepted;
    }

  private int nCode;
  private AvSessionStates(int code) {
    this.nCode = code;
  }
  public int value() { return this.nCode; }

    /**
     * 将整形值转换为枚举值
     * @param v 整型值
     * @return AvSessionStates枚举值
     */
  public static AvSessionStates fromInt(int v) {
    switch(v){
      case 3:
      return Connected;
      case 2:
      return Ringing;
      case 5:
      return Busy;
      case 15:
      return Held;
      case 14:
      return Hold;
      case 13:
      return Accepted;
      case 12:
      return Invited;
      case 10:
      return Error;
      case 11:
      return NotReachable;
      case 8:
      return HungUp;
      case 1:
      return Connecting;
      case 9:
      return End;
      case 7:
      return Rejected;
      case 4:
      return Failed;
      case 6:
      return Timeout;
      default:
      return null;
    }
  }

  @Override
  public String toString() {
      String state;
      switch (this) {
          case Connected:
              state = "Connected";
              break;
          case Held:
              state = "Held";
              break;
          case Hold:
              state = "Hold";
              break;
          case HungUp:
              state = "HungUp";
              break;
          case End:
              state = "End";
              break;
          case Connecting:
              state = "Connecting";
              break;
          case NotReachable:
              state = "NotReachable";
              break;
          case Ringing:
              state = "Ringing";
              break;
          case Busy:
              state = "Busy";
              break;
          case Rejected:
              state = "Rejected";
              break;
          case Invited:
              state = "Invited";
              break;
          case Accepted:
              state = "Accepted";
              break;
          case Error:
              state = "Error";
              break;
          case Failed:
              state = "Failed";
              break;
          case Timeout:
              state = "Timeout";
              break;
          default: {
              state = "NULL";
              break;
          }
      }
      return state;
  }
}
