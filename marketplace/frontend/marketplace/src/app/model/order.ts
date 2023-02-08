export interface Order {
  id: String | null,
  orderName: String,
  description: String,
  orderStatus: String
}

export const getNewOrder = () => ({ ...newOrder });

const newOrder: Order = {
  id: null,
  orderName: '',
  description: '',
  orderStatus: ''
};
