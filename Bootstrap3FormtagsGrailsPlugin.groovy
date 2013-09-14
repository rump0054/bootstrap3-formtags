class Bootstrap3FormtagsGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Bootstrap3 Formtags Plugin" // Headline display name of the plugin
    def author = "Erik Rumppe"
    def authorEmail = "erikrumppe@gmail.com"
    def description = '''\
A form taglib that is configure to output Twitter Bootstrap3 boilerplate code.  Inspired by and using some of
the plugin sourcecode from the nerdErg Taglib V2.0 - check them out https://github.com/nerdErg
'''

    // URL to the plugin's documentation
    //def documentation = "http://grails.org/plugin/bootstrap3-formtags"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "MIT"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Erik Rumppe", url: "https://github.com/ErikRumppe" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/ErikRumppe/bootstrap3-formtags" ]
}
