import { CLICK_UPDATE_VALUE } from "../actions/actionsTypes";
const initialState = {
    newValue: 'testando valor inicial de novo'
};
export const clickReducer = (state=initialState, action) => {
    switch(action.type){
        case CLICK_UPDATE_VALUE:
            return{
                ...state,
                newValue: action.newValue
            };

            default:
                return state;
    }
};  