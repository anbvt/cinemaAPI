import "//cdn.webix.com/libs/jet/webix-jet.js"
import Main from "./views/main.js";
import Dash from "./views/dash/index.js";
import Movie from "./views/management/movie/index.js"
import Showtime from "./views/management/showtime/index.js"
import Payment from "./views/management/payment/index.js"
const JetApp = webix.jet.JetApp;
const UrlRouter = webix.jet.UrlRouter;

export default class InventoryApp extends JetApp {
	constructor(config) {
		let theme = "";
		try {
			theme = webix.storage.local.get("theme_dash");
		}
		catch (err) {
			webix.message("You blocked cookies. The theme won't be restored after page reloads.", "debug");
		}

		super(webix.extend({
			id: "adminApp",
			router: UrlRouter,
			routerPrefix: "",
			start: "/admin/dash",
			views: {
				admin: Main,
				dash: Dash,
				"managementMovie": Movie,
				"management-showtime": Showtime,
				"management-payment": Payment,
			},
			theme: theme || ""
		}, config, true));
	}

}
