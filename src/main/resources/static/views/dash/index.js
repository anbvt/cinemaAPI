// import {JetView} from "webix-jet";
import "//cdn.webix.com/libs/jet/webix-jet.js"
import DashboardPriceOfYear from "./Dashboard/DashboardPriceOfYear.js";
import DashboardTicketOfYear from "./Dashboard/DashboardTicketOfYear.js";
import DashboardMovie from "./Dashboard/DashboardMovie.js";
const JetView = webix.jet.JetView;

export default class TopView extends JetView {

	config() {
		return {
			view: "scrollview",
			scroll: "y",
			body: {
				type: "space", height: 1050, rows: [
					{
						type: "wide",
						height: 400,
						cols: [{ $subview: DashboardPriceOfYear }, { $subview: DashboardTicketOfYear }]
					}, {
						type: "wide",
						height: 600,
						cols: [{ $subview: DashboardMovie }]
					}
				]
			}
		};
	}
}