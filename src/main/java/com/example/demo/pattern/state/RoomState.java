package com.example.demo.pattern.state;

public enum RoomState {

    Free {
        @Override
        public void reservation(RoomContext roomContext) {
            System.out.println("空房待预订");
            roomContext.setRoomState(Booked);
            System.out.println("预订成功");
        }
    },

    Booked {
        @Override
        public void cancel(RoomContext roomContext) {
            System.out.println("取消成功");
        }

        @Override
        public void checkIn(RoomContext roomContext) {
            System.out.println("办理入住成功");
            roomContext.setRoomState(CheckIn);
        }

        @Override
        public void checkOut(RoomContext roomContext) {
            System.out.println("退房成功");
        }
    },

    CheckIn {
        @Override
        public void cancel(RoomContext roomContext) {
            System.out.println("取消成功");
            roomContext.setRoomState(Free);
        }
        @Override
        public void checkOut(RoomContext roomContext) {
            System.out.println("退房成功");
            roomContext.setRoomState(Free);
        }
    },

    CheckOut {
        @Override
        public void reservation(RoomContext roomContext) {
            System.out.println("预订成功");
            roomContext.setRoomState(Booked);
        }

        @Override
        public void cancel(RoomContext roomContext) {
            System.out.println("取消成功");
        }
    };



    public void reservation(RoomContext roomContext) {
        throw new RuntimeException("不能预订，已经被占用");
    }
    public void cancel(RoomContext roomContext) {
        throw new RuntimeException("已经退订，不能再退订");
    }
    public void checkIn(RoomContext roomContext) {
        throw new RuntimeException("已经入住，不能再入住");
    }
    public void checkOut(RoomContext roomContext) {
        throw new RuntimeException("已经退房，已经再退房");
    }
}
