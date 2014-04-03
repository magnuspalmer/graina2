class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/login/form"(controller: "auth", action: "form")

        "/timeline/chuck_norris" {
            controller = "post"
            action = "timeline"
            id = "chuck_norris"
        }
        
        "/timeline" {
            controller = "post"
            action = "personal"
        }

        "/users/$id" {
            controller = "post"
            action = "timeline"
        }

        "/api/posts"(resources: "postRest")

        "/"(view: "/index")
        "500"(view:"/error")

        // Swap the above error mapping with these two once
        // http://jira.grails.org/browse/GRAILS-11281 is fixed.
//        "500"(controller: "error", action: "internalServer")
//        "404"(controller: "error", action: "notFound")
    }
}