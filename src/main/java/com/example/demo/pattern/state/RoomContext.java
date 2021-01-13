package com.example.demo.pattern.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomContext {

    private String roomNumber;

    private RoomState roomState = RoomState.Free;


    public static void main(String[] args) {
        RoomContext roomContext = new RoomContext();
        roomContext.setRoomNumber("1002");

        roomContext.getRoomState().reservation(roomContext);
        roomContext.getRoomState().checkIn(roomContext);
        roomContext.getRoomState().checkOut(roomContext);
        roomContext.getRoomState().cancel(roomContext);

    }

    /*
        空房待预订
        预订成功
        办理入住成功
        退房成功
        Exception in thread "main" java.lang.RuntimeException: 已经退订，不能再退订
            at com.example.demo.pattern.state.RoomState.cancel(RoomState.java:64)
            at com.example.demo.pattern.state.RoomContext.main(RoomContext.java:24)
     */

}
